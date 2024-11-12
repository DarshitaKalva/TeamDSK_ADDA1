/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamdsk.adda.da1;

/**
 *
 * @author MADDU SAHITHI
 */
public class Account {
    private String accountNumber;
    private String bankName;
    private int balance;

    public Account(String accountNumber, String bankName, int balance) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.balance = balance;
    }

    public int cashWithdrawal(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Amount: " + amount);
            return amount;
        } else {
            System.out.println("Insufficient balance.");
            return 0;
        }
    }

    public void cashDeposit(int amount) {
        balance += amount;
        System.out.println("Deposit successful. Amount: " + amount);
    }

    public String miniStatement() {
        return "Account Number: " + accountNumber + ", Balance: " + balance;
    }
    
    public int getBalance() {
        return balance;
    }
}
