/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamdsk.adda.da1;

/**
 *
 * @author MADDU SAHITHI
 */
public class MiniStatement {
    private String accountNumber;

    public MiniStatement(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void getBalance(Account account) {
        System.out.println(account.miniStatement());
    }
}
