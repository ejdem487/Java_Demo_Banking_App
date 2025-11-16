package Account;

public class Account {
/* statics: */
    private static final int bankCodefinal = 400;


    private double balance;
    private long accountNumber;
    private AccType accType;

    public Account (long accountNumber,double balance,AccType accType){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accType=accType;
    }

    public void printInfo(){
    }


    public static int getBankCode(){
        return bankCodefinal;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

    public AccType getAccType() {
        return accType;
    }

    public void setAccType(AccType accType) {
        this.accType = accType;

    }

    @Override
    public String toString() {
        return "Number: " + accountNumber + ",\nAccount type: " + accType + "\nbalance: " + balance;
    }

}

