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
public class Deposit extends Transaction {
    private String accountNumber;

    public Deposit(Date date, int amount, String accountNumber) {
        super(date, "Deposit", amount);
        this.accountNumber = accountNumber;
    }
}
