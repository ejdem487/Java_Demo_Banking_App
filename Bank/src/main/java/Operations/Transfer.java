package Operations;

import Account.Account;

public interface Transfer {
    public void execute(Account from, Account to, double amount);
}
