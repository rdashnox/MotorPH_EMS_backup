/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author CHAS
 */
public class MotorPH_NewPassword extends javax.swing.JFrame {
    private final String email;
    private final Connection connection;

    /**
     * Creates new form MotorPH_NewPassword
     */
    public MotorPH_NewPassword(String email, Connection connection) {
        initComponents();
        this.email = email;
        this.connection = connection;
    }
    
      private boolean validateOldPassword(String email, String oldPassword) {
        try {
            String query = "SELECT * FROM motorphemployees.emp_msdb WHERE email=? AND password=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, oldPassword);
            ResultSet resultSet = preparedStatement.executeQuery();

            boolean isValid = resultSet.next();

            resultSet.close();
            preparedStatement.close();

            return isValid;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        jPasswordField1Password = new javax.swing.JPasswordField();
        jPasswordField1Password1 = new javax.swing.JPasswordField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jPasswordField1Password4 = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(0, 0, 0));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jPanel26.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 80));

        jPanel25.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, 100));

        jPanel27.setBackground(new java.awt.Color(0, 0, 0));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Subject: MO-IT101 - Computer Programming 1");
        jPanel27.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, -1, 20));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Office Hours: 8:00AM - 5:00PM");
        jPanel27.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Office Address: 5th Flr., The World Center #330 Sen. Gil Puyat Ave., Makati City, Manila, Philippines");
        jPanel27.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 20));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Office Phone Number: +63-2-754-7000");
        jPanel27.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Office Email: support@motorph.com");
        jPanel27.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Section: A1101");
        jPanel27.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, -1, 30));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Group 1");
        jPanel27.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, 20));

        jPanel25.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1024, 100));
        jPanel25.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 560, 340));

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        jLabel82.setText("Welcome!");
        jPanel28.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, -1));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel84.setText("Old Password");
        jPanel28.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        Update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Update.setText("Update Password");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel28.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));
        jPanel28.add(jPasswordField1Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 230, -1));
        jPanel28.add(jPasswordField1Password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 230, -1));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel85.setText("New Password");
        jPanel28.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel86.setText("Confirm New Password");
        jPanel28.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        jPanel28.add(jPasswordField1Password4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 230, -1));

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel28.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jPanel25.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 340, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        String oldPassword = new String(jPasswordField1Password.getPassword());
        String newPassword = new String(jPasswordField1Password1.getPassword());
        String confirmPassword = new String(jPasswordField1Password4.getPassword());

        // Validate old password
        if (validateOldPassword(email, oldPassword)) {
            // Check if new password matches confirm password
            if (newPassword.equals(confirmPassword)) {
                // Update password in the database
                updatePassword(email, newPassword);

                // Update 'first_login' status to false
                updateFirstLoginStatus(email);

                JOptionPane.showMessageDialog(this, "Password changed successfully!");
                this.dispose();  // Close the ChangePasswordForm
            } else {
                JOptionPane.showMessageDialog(this, "New password and confirm password do not match.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid old password.");
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
       MotorPH_LoginFrame loginObj = new MotorPH_LoginFrame();
       loginObj.show();
    }//GEN-LAST:event_btnBackActionPerformed

        public void updatePassword(String email, String newPassword) {
        try {
            String query = "UPDATE motorphemployees.emp_msdb SET password=? WHERE email=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, email);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
        private void updateFirstLoginStatus(String email) {
        try {
            String query = "UPDATE motorphemployees.emp_msdb SET firstlogin=0 WHERE email=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String email = "";
        Connection connection = null;
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MotorPH_NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MotorPH_NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MotorPH_NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MotorPH_NewPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MotorPH_NewPassword(email,connection).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPasswordField jPasswordField1Password;
    private javax.swing.JPasswordField jPasswordField1Password1;
    private javax.swing.JPasswordField jPasswordField1Password4;
    // End of variables declaration//GEN-END:variables
}
