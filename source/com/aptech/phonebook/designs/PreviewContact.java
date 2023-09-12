package com.aptech.phonebook.designs;

import com.aptech.phonebook.App;
import com.aptech.phonebook.Contact;
import com.aptech.phonebook.PhoneBook;
import javax.swing.JOptionPane;

/**
 * @author somto
 */

public class PreviewContact extends javax.swing.JFrame {

    String contact_identifer;

    public PreviewContact() {
        initComponents();
    }

    public PreviewContact(Contact contact) {
        initComponents();
        contact_identifer = contact.getPhone_number();
        vfirstname.setText(contact.getFirstname());
        vlastname.setText(contact.getLastname());
        v_address.setText(contact.getAddress());
        v_city.setText(contact.getCity());
        v_phone.setText(contact.getPhone_number());
    }

    private void delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {

        PhoneBook phonebook = new PhoneBook();
        Contact contact = phonebook.findContact(v_phone.getText());
        System.out.println(contact.getFirstname());
        if (phonebook.deleteContact(contact) == 0) {
            JOptionPane.showMessageDialog(this, "Contact Deleted");
            this.setVisible(false);
            App.restart();
        } else {
            JOptionPane.showMessageDialog(this, "Contact Not Deleted");
        }
    }

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {

        PhoneBook phonebook = new PhoneBook();
        Contact contact = new Contact(
                vfirstname.getText(),
                vlastname.getText(),
                v_address.getText(),
                v_city.getText(),
                v_phone.getText());
        if (phonebook.modifyContact(contact_identifer, contact) == 0) {
            JOptionPane.showMessageDialog(this, "Saved");
            this.setVisible(false);
            App.restart();
        } else {
            JOptionPane.showMessageDialog(this, "Contact Not Modified");
        }
    }

    private javax.swing.JButton delete_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton save_btn;
    private javax.swing.JTextField v_address;
    private javax.swing.JTextField v_city;
    private javax.swing.JTextField v_phone;
    private javax.swing.JTextField vfirstname;
    private javax.swing.JTextField vlastname;

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        save_btn = new javax.swing.JButton();
        delete_button = new javax.swing.JButton();
        vfirstname = new javax.swing.JTextField();
        vlastname = new javax.swing.JTextField();
        v_address = new javax.swing.JTextField();
        v_phone = new javax.swing.JTextField();
        v_city = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(77, 77, 77)));

        jLabel2.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
        jLabel2.setText("Firstname: ");

        jLabel4.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
        jLabel4.setText("Lastname:");

        jLabel7.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
        jLabel7.setText("Address:");

        jLabel8.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
        jLabel8.setText("City:");

        jLabel10.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
        jLabel10.setText("Phone Number: ");

        save_btn.setForeground(new java.awt.Color(51, 0, 255));
        save_btn.setText("SAVE EDIT");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        delete_button.setBackground(new java.awt.Color(255, 51, 0));
        delete_button.setForeground(new java.awt.Color(255, 255, 255));
        delete_button.setText("DELETE");
        delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_buttonActionPerformed(evt);
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel4,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel7,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel8,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vfirstname)
                                                        .addComponent(vlastname, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                277, Short.MAX_VALUE)
                                                        .addComponent(v_address, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                277, Short.MAX_VALUE)
                                                        .addComponent(v_phone,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 277,
                                                                Short.MAX_VALUE)
                                                        .addComponent(v_city,
                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 277,
                                                                Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(save_btn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(delete_button)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(vfirstname, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(vlastname, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(v_address, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(v_city, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(v_phone, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(delete_button)
                                        .addComponent(save_btn))
                                .addGap(0, 18, Short.MAX_VALUE)));

        pack();
    }

}
