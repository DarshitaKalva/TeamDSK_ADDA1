/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamdsk.adda.da1;

/**
 *
 * @author darsh
 */
public class Customer {
    private String name;
    private int phoneNumber;
    private String emailId;
    private String userId;

    public Customer(String name, int phoneNumber, String emailId, String userId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.userId = userId;
    }

    public void updateInformation(String name, int phoneNumber, String emailId) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        System.out.println("Customer information updated.");
    }
}
