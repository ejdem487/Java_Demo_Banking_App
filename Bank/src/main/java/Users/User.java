package Users;

import Account.*;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String surename;
    private String email;
    private  List<Account> accounts = new ArrayList<>();
    private Enum role;
    private String password;

    @Override
    public String toString() {
        return "Name: " + name + ",\nSurename: " + surename + "\nEmail: " + email+ "\nAccounts: \n" + printAccounts(accounts) + "\nRole: "+role;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurename() {
        return surename;
    }
    public void setSurename(String surename) {
        this.surename = surename;
    }

    public Enum getRole() {
        return role;
    }
    public void setRole(Enum role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public List<Account> getAccounts() {
       return accounts;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }


    protected void addAccount(Account account){
        accounts.add(account); // protected protoze nezahrnuje kontroly duplicity uctu
    }

    public String printAccounts( List<Account> accounts){
        if (accounts.isEmpty()){
            return "User doesnt have any accounts";
        }
        StringBuilder output = new StringBuilder();
        for (Account account:accounts){
            output.append(account.toString());
            output.append("\n------------\n");

        }
        return output.toString();

    }



    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addNormalAccount() {
        if (findNormalAccount() == true||findPremiumAccount() == true){
            System.out.println("Normal or Premium account already exists");
            return;
        }
        accounts.add(AccountFactory.createNormalAccount());
        System.out.println("Normal account has been added");
    }

    public void addPremiumAccount() {
        if (findPremiumAccount() == true||findNormalAccount() == true){
            System.out.println("Premium or Normal account already exists");
            return;
        }
        accounts.add(AccountFactory.createPremiumAccount());
        System.out.println("Premium account has been added");
    }

    public void addSavingsAccount() {
        for (Account account:accounts){
            if (account instanceof SavingsAccount){
                System.out.println("User already has savings account");
                return;
            }
        }
        accounts.add(AccountFactory.createSavingsAccount());
    }

    public Account findPayingAccount(){
        for (Account account:accounts){
            if (account instanceof PremiumAccount || account instanceof  NormalAccount){
                return account;
            }
        }
        System.out.println("User doesnt have premium or normal account to pay");
        return null;
    }

    public Account findSavingsAccount(){
        for (Account account:accounts){
            if (account instanceof SavingsAccount){
                return account;
            }
        }
        System.out.println("User doesnt have savings account");
        return null;
    }

    public Boolean findNormalAccount(){
        for (Account account:accounts){
            if (account instanceof NormalAccount){
                return true;
            }
        }
        return false;
    }

    public Boolean findPremiumAccount(){
        for (Account account:accounts){
            if (account instanceof PremiumAccount){
                return true;
            }
        }
        return false;
    }

    public void removeNormalAccount(){
        if (accounts.isEmpty()){
            System.out.println("User already doesnt have Normal accounts");
        }
        // musim otestovat
        accounts.removeIf(account -> account instanceof NormalAccount);
    }

    public void removePremiumAccount(){
        if (accounts.isEmpty()){
            System.out.println("User already doesnt have Premium accounts");
        }
        accounts.removeIf(account -> account instanceof PremiumAccount);
    }

    public void removeSavingsAccount(){
        if (accounts.isEmpty()){
            System.out.println("User already doesnt have Savings accounts");
        }
        accounts.removeIf(account -> account instanceof SavingsAccount);
    }

    public User getUser(){
        return this;
    }

    //slouz i pouze k junit testum







    }








