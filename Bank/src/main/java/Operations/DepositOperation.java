package Operations;

import Account.Account;

public class DepositOperation implements Operation {
    private Account account;
    private double amount;

    public DepositOperation(Account account, double amount)
    {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (account == null || amount <= 0) {
            System.out.println("Error");
            return;
        }
            account.setBalance(account.getBalance() + amount);



    }


}




