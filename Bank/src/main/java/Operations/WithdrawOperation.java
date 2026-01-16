package Operations;

import Account.Account;

import java.util.Scanner;

public class WithdrawOperation implements Operation {
    private Account account;
    private final Scanner scanner;

    public WithdrawOperation(Account account, Scanner scanner)
    {
        this.account = account;
        this.scanner = scanner;
    }

    public double checkAmount() {

        while (true) {
            System.out.println("Please enter the amount you want to withdraw");
            try {
                double cur_amount = scanner.nextDouble();
                if (cur_amount > 0 && cur_amount <= account.getBalance()) {
                    return cur_amount;
                } else {
                    System.out.println("Invalid input, try again");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, try again");
                scanner.nextLine();
            }

        }
    }

    @Override
    public void execute() {
        if (account == null) {
            System.out.println("Cannot withdraw without account");
            return;
        }

            double depositamount = checkAmount();
            account.setBalance(account.getBalance() - depositamount);
            System.out.println("Deposited " + depositamount);


        }



    }






