/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamdsk.adda.da1;

/**
 *
 * @author MADDU SAHITHI
 */
import java.util.Date;

public class Transaction {
    private Date date;
    private String type;
    private int amount;

    public Transaction(Date date, String type, int amount) {
        this.date = date;
        this.type = type;
        this.amount = amount;
    }

    public void printReceipt() {
        System.out.println("Transaction Receipt: ");
        System.out.println("Date: " + date);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount);
    }
}
