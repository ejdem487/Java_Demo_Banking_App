package Bank;
import Account.Account;
import Users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private List<User> users = new ArrayList<>();
    private BankConsole bankConsole = new BankConsole(this);

    public void start(){
        bankConsole.start();
    }


    public void addUser(User user) {
        users.add(user);
    }
    public  List<User> getUsers() {
        return users;
    }
    public void printUsers() {
        System.out.println("---------------");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("---------------");
    }

    public User findUser(String email){
        for (User user: users){
            if (email.equals(user.getEmail())){
                System.out.println("user found");
            return user;}
        }
        System.out.println("User not found");
        return null;
        }

        public boolean isUser(String email){
        for (User user: users){
            if (email.equals(user.getEmail())){
                System.out.println("user found");
                return true;
            }

        }
        System.out.println("User not found");
        return false;
    }

    public boolean login(String email,String password){
        for (User user: users){
            if (user.getEmail().equals(email) && user.getPassword().equals(password)){
                System.out.println("user successfully logged in");
               return true;
            }
        }
        System.out.println("User not found");
        return false;
    }

    @Override
    public String toString() {
        String str = "";
        for (User user: users){
            str += user.toString();
        }
        return str;
    }

}


