package Operations;

import Account.Account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TransferToOtherAccount implements Operation{
    private Account from;
    private Account to;
    private Scanner scanner = new Scanner(System.in);

    public  TransferToOtherAccount(Account from,Account to){
        this.from=from;
        this.to=to;
    }


    public double checkBalance()
    {
        while (true){
            System.out.println("Please enter the amount you would like to send to your savings account:");
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
        double balance = checkBalance();
        if (from != null && to != null) {
            from.setBalance(from.getBalance() - balance);
            to.setBalance(to.getBalance() + balance);
            System.out.println("Your savings account balance is now: " + to.getBalance());
        }
        else  {
            System.out.println("Error: paying or savings account is null.");
        }
    }
}
