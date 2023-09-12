package com.aptech.phonebook;

/**
 * Contact Class: represent a contact in a phonebook with the following fields:
 * Firstname,
 * Lastname,
 * Address,
 * City and
 * Phone Number
 */
public class Contact {

    private String firstname, lastname, address, city, phone_number;

    public Contact(String firstname, String lastname, String address, String city, String phone_number) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.phone_number = phone_number;
    }

    /**
     * 
     * @return Contact's Firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Set's The Value For The Contact Firstname
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * 
     * @return Contact's Lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Set's The Value For The Contact Lastname
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * 
     * @return Contact's Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return Contact's City
     */
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return Contact's Phone
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * 
     * @param phone_number
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    /**
     * @return Contact's Details In A String Format
     */
    public String toString() {
        return firstname + "  <>  " + lastname + "  <>  " + address + "  <>  " + city + "  <>  " + phone_number + "\n";
    }

}
