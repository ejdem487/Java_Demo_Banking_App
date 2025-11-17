package Operations;

import Account.Account;

import java.util.Scanner;

public class DepositOperation implements Operation {
    private Account account;
    private Scanner scanner = new Scanner(System.in);

    public DepositOperation(Account account)
    {
        this.account = account;
    }

    public double checkAmount()
    {

        while (true) {
            System.out.println("Please enter the amount you want to deposit");
            try{
                double cur_amount = scanner.nextDouble();
                if ( cur_amount > 0 ){
                    return cur_amount;
                }
                else {
                    System.out.println("Invalid input, try again");
                }
            }

            catch (Exception e) {
                System.out.println("Invalid input, try again");
                scanner.nextLine();
            }

        }
    }

    @Override
    public void execute() {

        if (account == null) {
            System.out.println("Can't deposit without account");
            return;
        }
        double depositamount = checkAmount();
        account.setBalance(account.getBalance() + depositamount);
        System.out.println("Deposited " + depositamount);


    }


}




