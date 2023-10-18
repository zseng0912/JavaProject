/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Hotel_System;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */

    /**
     * Creates new form Profile
     */
 public class Profile extends javax.swing.JInternalFrame {

    private StaffInformation staff;

    public Profile(StaffInformation staff) {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        getContentPane().setBackground(new Color(238, 238, 238));
        this.staff = staff;


        if (staff != null) {
            nameTextField.setText(staff.getStaffName());
            emailTextField.setText(staff.getEmail());
            passwordTextField.setText(staff.getStaffPassword());
            secQuesComboBox.setSelectedItem(staff.getSecurityQuestion());
            answerTextField.setText(staff.getSecurityAnswer());
            addressTextField.setText(staff.getAddress());
            Status.setText(staff.getStatus());
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

        profileLogo = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        secQuesLabel = new javax.swing.JLabel();
        asnwerLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        answerTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        Status = new javax.swing.JLabel();
        secQuesComboBox = new javax.swing.JComboBox<>();
        updateBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        roleLabel = new javax.swing.JLabel();
        Role = new javax.swing.JLabel();

        profileLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profileSetup-removebg-preview_1_100x100.png"))); // NOI18N

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 153, 204));
        titleLabel.setText("Edit Profile");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 102, 204));
        emailLabel.setText("Email:");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(0, 102, 204));
        nameLabel.setText("Name:");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 102, 204));
        passwordLabel.setText("Password:");

        secQuesLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        secQuesLabel.setForeground(new java.awt.Color(0, 102, 204));
        secQuesLabel.setText("Security Question:");

        asnwerLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        asnwerLabel.setForeground(new java.awt.Color(0, 102, 204));
        asnwerLabel.setText("Answer:");

        addressLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(0, 102, 204));
        addressLabel.setText("Address:");

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(0, 102, 204));
        statusLabel.setText("Status:");

        Status.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        Status.setText("Approved");

        secQuesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is the name of your first pet?", "What was your first car?", "What primary school did you attend?", "What secondary school did you attend?", "What is the name of the town where you were born?" }));

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cancelBtn.setText("Cancel");

        roleLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        roleLabel.setForeground(new java.awt.Color(0, 102, 204));
        roleLabel.setText("Role:");

        Role.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Role.setText("Staff");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressLabel)
                            .addComponent(asnwerLabel)
                            .addComponent(emailLabel)
                            .addComponent(passwordLabel)
                            .addComponent(secQuesLabel)
                            .addComponent(statusLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answerTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secQuesComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Status, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addGap(18, 18, 18)
                                .addComponent(nameTextField))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(roleLabel)
                        .addGap(18, 18, 18)
                        .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(profileLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(titleLabel)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(profileLogo)
                .addGap(18, 18, 18)
                .addComponent(titleLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(roleLabel)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(secQuesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(secQuesLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(asnwerLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusLabel)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String name = nameTextField.getText();
        String role = Role.getText();
        String email = emailTextField.getText();
        String password = passwordTextField.getText();
        String securityQuestion = secQuesComboBox.getSelectedItem().toString();
        String securityAnswer = answerTextField.getText();
        String address = addressTextField.getText();
        String status = Status.getText();

        // Create a new StaffInformation object with the updated information
        StaffInformation updatedStaff = new StaffInformation(name, role, email, password, securityQuestion, securityAnswer, 
                address, status);

        // Call the updateStaffInformation method to update the staff information in staff.txt
        boolean updated = updateStaffInformation(updatedStaff);

        if (updated) {
            JOptionPane.showMessageDialog(null, "Staff information updated successfully.", "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
            // Add any additional logic or actions after successful update
        } else {
            JOptionPane.showMessageDialog(null, "Staff information updated unsuccess.", "Success", 
                    JOptionPane.INFORMATION_MESSAGE);
            // Add any necessary error handling or messages
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private boolean updateStaffInformation(StaffInformation updatedStaff) {
    try (BufferedReader reader = new BufferedReader(new FileReader("staff.txt"))) {
        StringBuilder fileContent = new StringBuilder();
        String line;
        boolean staffUpdated = false;
        while ((line = reader.readLine()) != null) {
            String[] staffRecord = line.split(";");
            if (staffRecord.length >= 7 && updatedStaff.getEmail().equals(staffRecord[2])) {
                staffRecord[0] = updatedStaff.getStaffName();// Update the name
                staffRecord[1] = updatedStaff.getRole();// Update the role
                staffRecord[3] = updatedStaff.getStaffPassword(); // Update the password
                staffRecord[4] = updatedStaff.getSecurityQuestion(); // Update the security question
                staffRecord[5] = updatedStaff.getSecurityAnswer(); // Update the security answer
                staffRecord[6] = updatedStaff.getAddress(); // Update the address
                line = String.join(";", staffRecord); // Reconstruct the line
                staffUpdated = true;
            }
            fileContent.append(line).append(System.lineSeparator());
        }

        if (!staffUpdated) {
            JOptionPane.showMessageDialog(null, "Email not found.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("staff.txt"))) {
            writer.write(fileContent.toString());
        }

        return true;
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error updating staff information: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Role;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField answerTextField;
    private javax.swing.JLabel asnwerLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel profileLogo;
    private javax.swing.JLabel roleLabel;
    private javax.swing.JComboBox<String> secQuesComboBox;
    private javax.swing.JLabel secQuesLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
