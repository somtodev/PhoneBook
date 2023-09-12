package com.aptech.phonebook.designs;

import com.aptech.phonebook.App;
import com.aptech.phonebook.Contact;
import com.aptech.phonebook.PhoneBook;

import javax.swing.JOptionPane;

/**
 *
 * @author somto
 */

 /**
  * AddContact is a JFrame for adding new contact.
  */
public class AddContact extends javax.swing.JFrame {

        /**
         * Constructor initializes all the JFrame Components 
         */
        public AddContact() {
                initComponents();
        }

        /**
         * Build up the gui components for AddContact
         */
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                v_firstname = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                v_lastname = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                v_address = new javax.swing.JTextField();
                v_city = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                v_phone = new javax.swing.JTextField();
                submit_btn = new javax.swing.JButton();
                back_btn = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));

                jPanel1.setBackground(new java.awt.Color(102, 0, 204));

                jLabel1.setFont(new java.awt.Font("SF UI Display Medium", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Phonebook");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1)
                                                                .addGap(80, 80, 80)));

                jLabel2.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
                jLabel2.setText("Firstname:");

                v_firstname.setFont(new java.awt.Font("SF UI Display Medium", 0, 18)); // NOI18N

                jLabel3.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
                jLabel3.setText("Lastname:");

                v_lastname.setFont(new java.awt.Font("SF UI Display Medium", 0, 18)); // NOI18N

                jLabel4.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
                jLabel4.setText("Address:");

                v_address.setFont(new java.awt.Font("SF UI Display Medium", 0, 18)); // NOI18N

                v_city.setFont(new java.awt.Font("SF UI Display Medium", 0, 18)); // NOI18N

                jLabel5.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
                jLabel5.setText("City:");

                jLabel6.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
                jLabel6.setText("Phone Number:");

                v_phone.setFont(new java.awt.Font("SF UI Display Medium", 0, 18));

                submit_btn.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
                submit_btn.setText("Create Contact");
                submit_btn.setBorderPainted(false);
                submit_btn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                submit_btnActionPerformed(evt);
                        }
                });

                back_btn.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
                back_btn.setText("Back");
                back_btn.setBorderPainted(false);
                back_btn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                back_btnActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(v_firstname)
                                                                                .addComponent(v_lastname)
                                                                                .addComponent(v_address)
                                                                                .addComponent(v_city)
                                                                                .addComponent(v_phone)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel2)
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addComponent(jLabel4)
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addComponent(jLabel6))
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(back_btn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                167,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                64,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(submit_btn,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                167,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                50,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(v_firstname,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(v_lastname,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(v_address,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(v_city,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(v_phone,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(submit_btn)
                                                                                .addComponent(back_btn))
                                                                .addContainerGap(21, Short.MAX_VALUE)));

                pack();
        }

        /**
         * Creates a contact on click of the submit button.
         * @param evt
         */
        private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {
                PhoneBook phonebook = new PhoneBook();
                Contact contact = new Contact(
                                v_firstname.getText(),
                                v_lastname.getText(),
                                v_address.getText(),
                                v_city.getText(),
                                v_phone.getText());

                if (validatePhoneNumber(contact.getPhone_number()) && validateFirstName(contact.getFirstname())) {
                        if (phonebook.addContact(contact) == 0) {
                                JOptionPane.showMessageDialog(this, "Contact Saved");
                        } else {
                                JOptionPane.showMessageDialog(this, "Contacts Cannot Have Same Phone Number");
                        }

                        this.setVisible(false);
                        String[] args = null;
                        App.main(args);
                }

        }

        /**
         * 
         * @param name
         * @return returns a boolean value based on the validation of the data the user passed
         */
        private boolean validateFirstName(String name) {

                if (name.length() < 0) {
                        JOptionPane.showMessageDialog(this, "Name field cannot be empty");
                        return false;
                }

                return true;
        }

        /**
         * 
         * @param phone_number
         * @return returns a boolean value based on the validation of the data the user passed.
         */
        private boolean validatePhoneNumber(String phone_number) {
                if (phone_number.length() < 1) {
                        JOptionPane.showMessageDialog(this, "Phone number cannot be empty");
                        return false;
                }

                if (phone_number.length() < 10) {
                        JOptionPane.showMessageDialog(this, "Phone number must have 10 digits");
                        return false;
                }

                if (phone_number.length() > 12) {
                        JOptionPane.showMessageDialog(this, "Phone number must not have more than 12 digits");
                        return false;
                }

                return true;
        }

        /**
         * Returns to the main page
         * @param evt
         */
        private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_back_btnActionPerformed
                this.setVisible(false);
                App.restart();
        }

        private javax.swing.JButton back_btn;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JButton submit_btn;
        private javax.swing.JTextField v_address;
        private javax.swing.JTextField v_city;
        private javax.swing.JTextField v_firstname;
        private javax.swing.JTextField v_lastname;
        private javax.swing.JTextField v_phone;

}
