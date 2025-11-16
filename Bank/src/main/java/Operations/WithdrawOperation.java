package Operations;

import Account.Account;

public class WithdrawOperation implements Operation {
    private Account account;
    private double amount;

    public WithdrawOperation(Account account, double amount)
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

            if (account.getBalance() >= amount) {
                account.setBalance(account.getBalance() - amount);
            }
            else {
                System.out.println("Insufficient funds");
            }


        }



    }






