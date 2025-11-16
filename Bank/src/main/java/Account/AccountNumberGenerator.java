package Account;

public class AccountNumberGenerator { //klasicky Singleton
    private static AccountNumberGenerator instance;
    private long currentAccountNumber = 1200; //zde by byla hodnota z databaze
    private AccountNumberGenerator() {
    }
    public static AccountNumberGenerator getInstance() {
        if (instance == null) {
            instance = new AccountNumberGenerator();
        }
        return instance;
    }

    public long generateAccountNumber() {
        return currentAccountNumber++;
    }
}
