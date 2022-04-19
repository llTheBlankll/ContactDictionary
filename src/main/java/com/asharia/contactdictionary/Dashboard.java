package com.asharia.contactdictionary;

import com.formdev.flatlaf.FlatLightLaf;
import org.apache.log4j.Logger;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dashboard extends javax.swing.JFrame {

    private final Connect connection = new Connect();
    private final Logger logger = Logger.getLogger(this.getClass());

    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);

        // Get the Table data from the database and import it to Contact Table.
        refreshContactTable();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_phoneNumber = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_alias = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        dashboard_menu = new javax.swing.JMenuBar();
        menu_program = new javax.swing.JMenu();
        program_jmenuItem_closeProgram = new javax.swing.JMenuItem();
        menu_contact = new javax.swing.JMenu();
        menuItem_searchContact = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        container.setPreferredSize(new java.awt.Dimension(750, 350));

        contactTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Phone number", "Name", "Email", "Alias"
                }
        ) {
            final Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(contactTable);
        if (contactTable.getColumnModel().getColumnCount() > 0) {
            contactTable.getColumnModel().getColumn(0).setResizable(false);
            contactTable.getColumnModel().getColumn(1).setResizable(false);
            contactTable.getColumnModel().getColumn(2).setResizable(false);
            contactTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Phone Number:");

        txt_phoneNumber.setToolTipText("Phone number (e.g: 9998216556)");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Name:");

        txt_name.setToolTipText("Name of the person.");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Email:");

        txt_email.setToolTipText("Email address (Optional)");

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setText("Alias:");

        txt_alias.setToolTipText("Alias of a person (Optional)");

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Table Control");
        jLabel1.setToolTipText("");

        btn_delete.setText("Delete");

        btn_update.setText("Update");

        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
                containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(containerLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerLayout.createSequentialGroup()
                                                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                                        .addComponent(txt_phoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                                        .addComponent(txt_alias, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(containerLayout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(btn_save))
                                        .addGroup(containerLayout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(btn_refresh)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
                containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(containerLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_delete)
                                        .addComponent(btn_update))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_refresh)
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        menu_program.setText("Program");

        program_jmenuItem_closeProgram.setText("Close Program");
        program_jmenuItem_closeProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                program_jmenuItem_closeProgramActionPerformed(evt);
            }
        });
        menu_program.add(program_jmenuItem_closeProgram);

        dashboard_menu.add(menu_program);

        menu_contact.setText("Contact");

        menuItem_searchContact.setText("Search Contact");
        menu_contact.add(menuItem_searchContact);

        dashboard_menu.add(menu_contact);

        setJMenuBar(dashboard_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private String checkAllInput() {
        if (txt_phoneNumber.getText().equals("")) {
            return "Phone number cannot be empty.";
        } else if (txt_name.getText().equals("")) {
            return "Name cannot be empty.";
        }

        return "good";
    }

    private void program_jmenuItem_closeProgramActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(1);
    }

    private void refreshContactTable() {
        try {
            Connection con = connection.getConnection();

            // Get all data from contacts table.
            PreparedStatement ps = con.prepareStatement("SELECT * FROM contacts");
            ResultSet rs = ps.executeQuery();

            // TableModel for manipulating data.
            DefaultTableModel model = (DefaultTableModel) contactTable.getModel();

            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new String[]{rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (SQLException | ClassNotFoundException ex) {
            logger.fatal(ex.getMessage());
            System.exit(ex.hashCode());
        }
    }

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        if (!checkAllInput().equals("good")) {
            JOptionPane.showMessageDialog(rootPane, "Error: Please fill all input required.", "Requirements not met", JOptionPane.ERROR_MESSAGE);
        }

        try {
            Connection con = connection.getConnection();

            PreparedStatement ps = con.prepareStatement("INSERT INTO contacts (contact_phone, contact_name, contact_email, contact_alias) VALUES (?, ?, ?, ?)");

            ps.setString(1, txt_phoneNumber.getText());
            ps.setString(2, txt_name.getText());
            ps.setString(3, txt_email.getText());
            ps.setString(4, txt_alias.getText());

            if (ps.execute()) {
                txt_phoneNumber.setText("");
                txt_name.setText("");
                txt_email.setText("");
                txt_alias.setText("");
                JOptionPane.showMessageDialog(null, "Contact info successfully saved!", "INFO: Success!", JOptionPane.INFORMATION_MESSAGE);
            }

            ps.close();
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            logger.fatal(ex.getMessage());
            System.exit(ex.hashCode());
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        refreshContactTable();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FlatLightLaf.setup();

        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JTable contactTable;
    private javax.swing.JPanel container;
    private javax.swing.JMenuBar dashboard_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuItem_searchContact;
    private javax.swing.JMenu menu_contact;
    private javax.swing.JMenu menu_program;
    private javax.swing.JMenuItem program_jmenuItem_closeProgram;
    private javax.swing.JTextField txt_alias;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phoneNumber;
    // End of variables declaration//GEN-END:variables
}
