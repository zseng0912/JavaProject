/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel_System;

/**
 *
 * @author USER
 */
public class StaffInformation {
    private String staffName;
    private String role;
    private String email;
    private String staffPassword;
    private String securityQuestion;
    private String securityAnswer;
    private String address;
    private String status;

        public StaffInformation(String staffName, String role, String email, String staffPassword, String securityQuestion, String securityAnswer, String address,String status) {
        this.staffName = staffName;
        this.role = role;
        this.email = email;
        this.staffPassword = staffPassword;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.address = address;
        this.status = status;
    }


    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStaffPassword(String staffPassword) {
        this.staffPassword = staffPassword;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(String status) {
        this.status = status;
    }

public String getStaffName() {
        return staffName;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getStaffPassword() {
        return staffPassword;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }
}

