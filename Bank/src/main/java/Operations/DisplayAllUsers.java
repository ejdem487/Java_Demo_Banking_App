package Operations;

import Bank.Bank;

public class DisplayAllUsers implements Operation {
    private Bank bank;
    public DisplayAllUsers(Bank bank) {
        this.bank = bank;
    }
    @Override
    public void execute() {
        System.out.println("Displaying all users");
        System.out.println("------------------");
        System.out.println(bank);
        System.out.println("------------------");

    }
}
