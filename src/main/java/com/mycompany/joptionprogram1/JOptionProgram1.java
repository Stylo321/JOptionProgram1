/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.joptionprogram1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class JOptionProgram1 {

    public static void main(String[] args) {
        // Get employee details
        String name = JOptionPane.showInputDialog("Enter Employee Name:");
        String empNumber = JOptionPane.showInputDialog("Enter Employee Number (e.g., EP2025):");
        String ageInput = JOptionPane.showInputDialog("Enter Employee Age:");

        // Convert age to integer
        int age = Integer.parseInt(ageInput);

        // Check pension eligibility
        String message = "Employee Name: " + name + 
                         "\nEmployee Number: " + empNumber + 
                         "\nAge: " + age + 
                         "\nStatus: " + (age >= 50 ? "Eligible for Pension" : "Not Eligible for Pension");

        // Display result
        JOptionPane.showMessageDialog(null, message);
    }
}