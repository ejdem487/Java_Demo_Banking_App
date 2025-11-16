package Operations;

import Bank.Bank;
import Bank.BankConsole;

import java.util.Scanner;

public class Login implements Operation{
    private final Bank bank;
    private final BankConsole console;
    private final Scanner scanner;
    public Login(Bank bank, BankConsole console,Scanner scanner) {
        this.bank = bank;
        this.console = console;
        this.scanner = scanner;
    }
    @Override
    public void execute() {

        System.out.println("Enter your email");
            String email = scanner.nextLine();
            System.out.println("Enter your password");
            String password = scanner.nextLine();
            if (bank.login(email,password)){
                System.out.println("Welcome "+email);
                console.Userrun(email);
                return;
            }
            else{
                System.out.println("Wrong email or password");
                return;
            }
        }

}
