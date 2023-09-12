package com.aptech.phonebook.designs;

import com.aptech.phonebook.Contact;
import com.aptech.phonebook.PhoneBook;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class ContactsPage extends javax.swing.JFrame {

        public ContactsPage() {
                initComponents();

                PhoneBook phonebook = new PhoneBook();

                DefaultListModel<String> contacts = new DefaultListModel<>();

                phonebook.getContacts().forEach(c -> {
                        contacts.addElement(c.getFirstname() + " " + c.getLastname() + " | " + c.getPhone_number());
                });

                no_of_contacts.setText("" + phonebook.getContacts().size());

                if (phonebook.getContacts().size() <= 0) {
                        contacts_list.setVisible(false);
                } else {
                        contacts_list.setModel(contacts);
                }

        }

        private void search_termActionPerformed(java.awt.event.ActionEvent evt) {
                PhoneBook phonebook = new PhoneBook();

                DefaultListModel<String> contacts = new DefaultListModel<>();

                ArrayList<Contact> matched = phonebook.searchContacts(search_term.getText());

                for (Contact c : matched) {
                        contacts.addElement(c.getFirstname() + " " + c.getLastname() + " | " + c.getPhone_number());
                }

                no_of_contacts.setText("" + matched.size());

                if (matched.size() <= 0) {
                        contacts_list.setVisible(false);
                } else {
                        contacts_list.setModel(contacts);
                }
        }

        private void contacts_listMouseClicked(java.awt.event.MouseEvent evt) {

                this.setVisible(false);

                String phone = contacts_list.getSelectedValue().split(" ")[3];

                PhoneBook phonebook = new PhoneBook();
                Contact contact = phonebook.findContact(phone);

                PreviewContact obj = new PreviewContact(contact);
                obj.setVisible(true);

        }

        private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {

                this.setVisible(false);
                AddContact obj = new AddContact();
                obj.setVisible(true);

        }

        public static void main(String args[]) {

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new ContactsPage().setVisible(true);
                        }
                });

        }

        private javax.swing.JList<String> contacts_list;
        private javax.swing.JButton jButton1;
        private javax.swing.JDialog jDialog1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JLabel no_of_contacts;
        private javax.swing.JTextField search_term;

        private void initComponents() {

                jDialog1 = new javax.swing.JDialog();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                search_term = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jLabel2 = new javax.swing.JLabel();
                no_of_contacts = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jScrollPane2 = new javax.swing.JScrollPane();
                contacts_list = new javax.swing.JList<>();

                javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
                jDialog1.getContentPane().setLayout(jDialog1Layout);
                jDialog1Layout.setHorizontalGroup(
                                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 400, Short.MAX_VALUE));
                jDialog1Layout.setVerticalGroup(
                                jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 300, Short.MAX_VALUE));

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));

                jPanel1.setBackground(new java.awt.Color(102, 0, 204));

                jLabel1.setFont(new java.awt.Font("SF UI Display Medium", 1, 24)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Phonebook");

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));

                search_term.setToolTipText("Search");
                search_term.setBorder(null);
                search_term.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
                search_term.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                search_termActionPerformed(evt);
                        }
                });

                jLabel3.setBackground(new java.awt.Color(255, 102, 102));
                jLabel3.setForeground(new java.awt.Color(51, 51, 51));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("Search");
                jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                                .createSequentialGroup()
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                93, Short.MAX_VALUE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(search_term,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                287,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(search_term,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                38,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                38,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));

                jButton1.setFont(new java.awt.Font("SF UI Display Medium", 0, 16)); // NOI18N
                jButton1.setForeground(new java.awt.Color(51, 51, 255));
                jButton1.setText("Add Contact");
                jButton1.setBorder(null);
                jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jButton1.setMaximumSize(new java.awt.Dimension(90, 34));
                jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jButton1MouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel1)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                118,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(jButton1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                29,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(26, Short.MAX_VALUE)));

                jLabel2.setText("Contacts: ");

                no_of_contacts.setText("0");

                contacts_list.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                contacts_list.setModel(new javax.swing.AbstractListModel<String>() {
                        String[] strings = { "Contact 1", "Contact 2", "Contact 3" };

                        public int getSize() {
                                return strings.length;
                        }

                        public String getElementAt(int i) {
                                return strings[i];
                        }
                });
                contacts_list.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                contacts_listMouseClicked(evt);
                        }
                });
                jScrollPane2.setViewportView(contacts_list);

                jScrollPane1.setViewportView(jScrollPane2);

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
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel2)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(no_of_contacts)
                                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                                .addComponent(jScrollPane1))
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                312, Short.MAX_VALUE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(no_of_contacts))
                                                                .addContainerGap()));

                pack();
        }

}
