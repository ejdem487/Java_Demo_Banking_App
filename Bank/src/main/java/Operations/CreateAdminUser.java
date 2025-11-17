package Operations;

import Account.Account;
import Bank.Bank;
import Users.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAdminUser implements CreateUser {

    private String name;
    private String surname;
    private String email;
    private ArrayList<Account> accounts;
    private final Bank bank;
    private String password;

    private static final Scanner INPUT = new Scanner(System.in);

    @Override
    public void getData() {
        name = readNonEmpty("Enter Name: ");
        surname = readNonEmpty("Enter Surname: ");
        email = readEmail("Enter Email: ");
        password = readNonEmpty("Enter Password: ");
    }

    @Override
    public void execute() {
        try {
            getData();


            if (isBlank(name) || isBlank(surname) || isBlank(email)) {

                System.out.println("User data is incomplete !!");
                return;
            }

            UserBuilder userBuilder = new AdminWorkerBuilder();
            UserDirector userDirector = new AdminUserDirector(userBuilder, bank);
            User usr = userDirector.createUser(name, surname, email, new ArrayList<>(),password,UserType.ADMIN);

            System.out.println("Created User: " + usr);
        } catch (Exception e) {
            System.out.println("Something went wrong while trying to create the User: " + e.getMessage());
        }
    }


    private static String readNonEmpty(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = INPUT.nextLine().trim();
            if (!s.isEmpty()) return s;
            System.out.println("Value cannot be empty. Try again.");
        }
    }

    private  String readEmail(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = INPUT.nextLine().trim();

            boolean isvalid =  (!s.isEmpty() && s.contains("@") && s.indexOf('@') > 0 && s.lastIndexOf('.') > s.indexOf('@') + 1);

            if (!isvalid){
                System.out.println("Invalid email address !!, please try again");
                 continue;}
            if (bank.isUser(s)){
                System.out.println("Email already exists !!!, please try again");
                continue;
            }
            return s;

        }


        }





    private static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    public CreateAdminUser(Bank bank) {
        this.bank = bank;
    }
}
