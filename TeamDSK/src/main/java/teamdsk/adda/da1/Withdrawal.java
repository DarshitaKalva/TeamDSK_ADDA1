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
public class Withdrawal extends Transaction {
    private String accountNumber;

    public Withdrawal(Date date, int amount, String accountNumber) {
        super(date, "Withdrawal", amount);
        this.accountNumber = accountNumber;
    }

    public int getBalance(Account account) {
        return account.getBalance();
    }
}
