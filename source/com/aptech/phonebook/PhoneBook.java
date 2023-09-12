package com.aptech.phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * PhoneBook: represent a phonebook that can perform operations on contacts
 */
public class PhoneBook {

    /** 
     * The File Location For The Contact.txt
     */
    String file_location = "/home/somto/Documents/programming/java/PhoneBook/resources/Contacts.txt";

    /**
     * A Collection to hold all contacts read from the contacts.txt file
     */
    ArrayList<Contact> contacts = new ArrayList<>();

    // A Getter For The Contacts Collection
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    /*
     * Constructors
     * Once the phonebook class is instantiated it, calls a function
     */
    public PhoneBook() {
        readContacts();
    }

    /**
     * 
     * @param contact
     * @return Integer Based On Execution Of Operation 0 for success, -1 for failure
     */
    public int addContact(Contact contact) {

        boolean foundContact = contacts.stream()
                .anyMatch(row -> row.getPhone_number().equals(contact.getPhone_number()));

        if (foundContact != true) {
            contacts.add(contact);
        } else {
            return -1;
        }

        writeToContactsToFile();
        return 0;

    }

    /**
     * 
     * @param contact
     * @return Integer Based On Execution Of Operation 0 for success, -1 for failure
     */
    public int deleteContact(Contact contact) {

        if (contacts.remove(contacts.stream().filter(c -> c.getPhone_number().equals(contact.getPhone_number()))
                .findFirst().orElse(null))) {
            writeToContactsToFile();
            return 0;
        }

        return -1;
    }

    /**
     * 
     * @param prev_phone
     * @param contact
     * @return Integer Based On Execution Of Operation 0 for success, -1 for failure
     */
    public int modifyContact(String prev_phone, Contact contact) {
        contacts.forEach(c -> {
            if (c.getPhone_number().equals(prev_phone)) {
                c.setFirstname(contact.getFirstname());
                c.setLastname(contact.getLastname());
                c.setAddress(contact.getAddress());
                c.setCity(contact.getCity());
                c.setPhone_number(contact.getPhone_number());
            }
        });
        writeToContactsToFile();
        return 0;
    }

    /**
     * 
     * @param search_term
     * @return An ArrayList Of Contacts With The Search Term as a firstname, lastname or phone number.
     */
    public ArrayList<Contact> searchContacts(String search_term) {

        search_term = search_term.toLowerCase();

        ArrayList<Contact> matchingContacts = new ArrayList<>();

        for (Contact contact : contacts) {
            if (contact.getFirstname().toLowerCase().contains(search_term) ||
                    contact.getLastname().toLowerCase().contains(search_term) ||
                    contact.getPhone_number().toLowerCase().startsWith(search_term)) {
                matchingContacts.add(contact);
            }
        }

        return matchingContacts;
    }

    /**
     * Loads all the contacts from the text file into an arrayList of Contact class.
     */
    void readContacts() {

        try {
            Scanner in = new Scanner(new File(file_location)).useDelimiter("<>");

            while (in.hasNextLine()) {
                contacts.add(
                        new Contact(
                                in.next().trim(),
                                in.next().trim(),
                                in.next().trim(),
                                in.next().trim(),
                                in.next().trim()));
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(new JPanel(), "Encountered Issues Accessing Contacts");
        }

    }

    /**
     * Write new contact or modified contact details into the contact text file.
     */
    void writeToContactsToFile() {

        try {

            FileWriter dest = new FileWriter(file_location);

            int counter = 0;
            for (Contact c : contacts) {
                counter += 1;
                if (counter == contacts.size()) {
                    dest.write(c.toString());
                } else {
                    dest.write(c.toString() + "<>");
                }

            }

            dest.close();

        } catch (IOException iOException) {
            JOptionPane.showMessageDialog(new JPanel(), "Contact Unsaved");
        }

    }

    /**
     * 
     * @return the number of contacts in the phonebook
     */
    public int getNumberOfContacts() {
        return contacts.size();
    }

    /**
     * 
     * @param phone
     * @return Finds the contact that has the phone number which is passed as a param
     */
    public Contact findContact(String phone) {

        for (Contact contact : contacts) {
            if (contact.getPhone_number().equals(phone)) {
                return contact;
            }
        }

        return null;

    }

}
