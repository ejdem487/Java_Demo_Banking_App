package Operations;

import Account.Account;
import Bank.Bank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TransferToSpecificAccount implements Operation {
    private final Bank bank;
    private Account from; //to uz je vyresene
    private Account to;
    private final Scanner scanner;
    public TransferToSpecificAccount(Bank bank,Scanner scanner, Account from){
        this.bank=bank;
        this.from=from;
        this.scanner = scanner;
    }

    public void findacc() {
        while(true){
            try{
            System.out.println("Please enter account number: ");
            Integer number=scanner.nextInt();
            if (bank.checkAccountExistency(number)){
                to = bank.findAccount(number);
                break;
            }
            else{
                System.out.println("Account number not found");
            }
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a valid account number");
                scanner.next();
            }
        }


    }

    public double checkBalance()
    {
        while (true){
            System.out.println("Please enter the amount you would like to transfer:");
            try {
                double input = scanner.nextDouble();

                if (input <= from.getBalance()&& input >0){
                    return input;
                }
                else if(input <=0){
                    System.out.println("Amount must be greater than zero");
                }
                else {
                    System.out.println("Insufficient balance");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input: "+e.getMessage()+"\n please try again");
                scanner.nextLine();
            }

        }
    }


    @Override
    public void execute() {
        if (from == null) {
            System.out.println("User doesnt have paying account");

        }
        else {
            findacc();
            if (from.getAccountNumber() == to.getAccountNumber()){
                System.out.println("You cant tranfer from one and to one same account");
            }
            else{
            double balance = checkBalance();
            from.setBalance(from.getBalance()-balance);
            to.setBalance(to.getBalance()+balance);
                System.out.println("Payment has been successful!\nYour account balance is "+from.getBalance());
            }
        }
    }
}
