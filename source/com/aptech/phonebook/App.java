package com.aptech.phonebook;

import com.aptech.phonebook.designs.ContactsPage;

/**
 * Phonebook Application Main Class
 */

public class App {

    /**
     * Re-renders the whole application after a modification or when returning to the main page.
     */
    public static void restart() {
        String[] args = null;
        App.main(args);
    }

    /**
     * PhoneBook Start Point
     * @param args
     */
    public static void main(String[] args) {

        ContactsPage mainpage = new ContactsPage();
        mainpage.setVisible(true);

    }

}
