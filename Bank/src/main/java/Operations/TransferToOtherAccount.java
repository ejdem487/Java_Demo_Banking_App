package Operations;

import Account.Account;

public class TransferToOtherAccount implements Operation {
    private final Account from;
    private final Account to;
    private final double amount;

    public TransferToOtherAccount(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }


    @Override
    public void execute() {
        if (from == null || to == null) {
            System.out.println("Error: from/to is null");
            return;
        }
        if (from.getBalance() < amount) {
            System.out.println("Insufficient funds.");}

        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
        System.out.println("Amount successfully transferred: " + amount);
        }

}

