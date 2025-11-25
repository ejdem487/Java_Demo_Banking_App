package Bank;

import Operations.*;
import Users.NormalUserBuilder;
import Users.NormalUserDirector;
import Users.User;

import java.util.Scanner;

public class BankConsole {
    private  Bank bank;
    private OperationInvoker invoker =  new OperationInvoker();
    private Scanner sc = new Scanner(System.in);


    public  BankConsole(Bank bank){
        this.bank = bank;

    }

    public void start(){
        while (true) {
            System.out.println("Welcome to out Bank");
            System.out.println("What would you like to do?");
            System.out.println("1. Create Account");
            System.out.println("2. Display Accounts");
            System.out.println("3. Log in");
            System.out.println("4. Quit");
            try {
                int choice = sc.nextInt();


            sc.nextLine();
            switch (choice){
                case 1:
                    Operation createnormaluser = new CreateNormalUser(bank);
                    invoker.executeOperation((createnormaluser));
                    break;
                    case 2:
                    Operation displayallusers = new DisplayAllUsers(bank);
                    invoker.executeOperation(displayallusers);
                    break;
                    case 3:
                        Operation loginuser = new Login(bank,this,sc);
                        invoker.executeOperation(loginuser);
                        break;
                        case 4:
                            System.out.println("Goodbye!");
                            System.exit(0);
                            default:
                                System.out.println("Sorry this does nothing, try again");
            }
        }
            catch (Exception e) {
                System.out.println("Invalid input.");
                sc.nextLine();
                continue;
            }
        }

    }



    public void Userrun(String email) {
        while (true){
            System.out.print("Welcome to our Bank: ");
            System.out.println("Select your choice: ");
            System.out.println("1. assign normal account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer to savings account");
            System.out.println("5. Assign Savings Account");
            System.out.println("8. Quit");
            Integer choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    Operation assignnormalacc = new AssignNormalAccount(bank.findUser(email));
                    invoker.executeOperation(assignnormalacc);
                    break;
                case 2:
                    Operation depositoperaion = new DepositOperation(bank.findUser(email).findPayingAccount());
                    invoker.executeOperation(depositoperaion);
                    break;
                case 3:
                    Operation withdrawoperation = new WithdrawOperation(bank.findUser(email).findPayingAccount());
                    invoker.executeOperation(withdrawoperation);
                    break;
                case 4:
                    Operation transfertosavingsaccout = new TransferToSavingsAccount(bank.findUser(email).findPayingAccount(),bank.findUser(email).findSavingsAccount());
                    invoker.executeOperation(transfertosavingsaccout);
                    break;
                case 5:
                    Operation assignsavingsaccount = new AssignSavingsAccount(bank.findUser(email));
                    invoker.executeOperation(assignsavingsaccount);
                    break;
                    case 8:
                        System.out.println("Bye");
                        return;
            }


        }
        }

    }



