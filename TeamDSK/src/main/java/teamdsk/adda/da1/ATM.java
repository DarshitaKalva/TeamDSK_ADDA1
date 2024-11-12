/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamdsk.adda.da1;

/**
 *
 * @author darsh
 */
public class ATM {
    private int pin;
    private String location;
    private String bankName;

    public ATM(String location, String bankName) {
        this.location = location;
        this.bankName = bankName;
    }

    public boolean validatePin(int pin) {
        this.pin = pin;
        // Dummy validation for demonstration
        return true;
    }

    public void selectLanguage(String language) {
        System.out.println("Language selected: " + language);
    }

    public void displayOptions() {
        System.out.println("Options: Withdraw, Deposit, Mini Statement");
    }
}
