package Operations;

import Account.Account;

public class TransferToOtherAccount implements Transfer {
    public void execute(Account from, Account to, double amount) {
        if (from == null || to == null) {
            System.out.println("Error: from/to is null");
            return;
        }
        if (from.getBalance() < amount) {
            System.out.println("Insufficient funds.");}
        }
    }

