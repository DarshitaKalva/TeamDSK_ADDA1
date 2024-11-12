/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package teamdsk.adda.da1;

/**
 *
 * @author darsh
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package teamdsk.adda.da1;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class TeamDSK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ATM Location: ");
        String atmLocation = scanner.nextLine();
        System.out.print("Enter Bank Name: ");
        String bankName = scanner.nextLine();
        ATM atm = new ATM(atmLocation, bankName);

        System.out.print("Enter ATM PIN: ");
        int atmPin = scanner.nextInt();
        atm.validatePin(atmPin);
        
        scanner.nextLine(); // Consume newline
        System.out.print("Select Language: ");
        String language = scanner.nextLine();
        atm.selectLanguage(language);
        
        atm.displayOptions();

        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter Customer Phone Number: ");
        int customerPhone = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Customer Email: ");
        String customerEmail = scanner.nextLine();
        System.out.print("Enter Customer ID: ");
        String customerId = scanner.nextLine();
        Customer customer = new Customer(customerName, customerPhone, customerEmail, customerId);

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        int initialBalance = scanner.nextInt();
        Account account = new Account(accountNumber, bankName, initialBalance);

        System.out.print("Enter Withdrawal Amount: ");
        int withdrawalAmount = scanner.nextInt();
        int withdrawnAmount = account.cashWithdrawal(withdrawalAmount);
        System.out.println("Withdrew: " + withdrawnAmount + ", New Balance: " + account.miniStatement());

        System.out.print("Enter Deposit Amount: ");
        int depositAmount = scanner.nextInt();
        account.cashDeposit(depositAmount);
        System.out.println("Deposited " + depositAmount + ", New Balance: " + account.miniStatement());

        Transaction transaction = new Transaction(new Date(), "Withdrawal", withdrawalAmount);
        transaction.printReceipt();

        MiniStatement miniStatement = new MiniStatement(accountNumber);
        miniStatement.getBalance(account);

        scanner.close();
    }
}

