/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamdsk.adda.da1;

/**
 *
 * @author darsh
 */
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public boolean authorizeAccount(Account account) {
        // Dummy authorization logic
        return accounts.contains(account);
    }

    public void manageTransaction(Transaction transaction) {
        System.out.println("Managing transaction: " + transaction);
    }
}
