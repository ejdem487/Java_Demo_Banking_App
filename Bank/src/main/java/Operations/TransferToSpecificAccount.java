package Operations;

import Account.Account;
import Bank.Bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TransferToSpecificAccount implements Operation {
    private final Bank bank;
    private Account from; //to uz je vyresene
    private Account to;
    private final Scanner scanner = new Scanner(System.in);
    public TransferToSpecificAccount(Bank bank, Account from, Account to){
        this.bank=bank;
        this.from=from;
        this.to=to;
    }

    public Account findacc() {
        while(true){
            try{
            System.out.println("Please enter account number: ");
            Integer number=scanner.nextInt();
            if (bank.checkAccountExistency(number)){
                return bank.findAccount(number);
            }
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a valid account number");
                scanner.next();
            }
        }
    }


    @Override
    public void execute() {
    }
}
