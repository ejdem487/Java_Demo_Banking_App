package Users;
import Account.*;
import Bank.Bank;

import java.util.List;

public class NormalUserDirector implements UserDirector{
    private UserBuilder userBuilder;
    private Bank bank;

    public NormalUserDirector(UserBuilder userBuilder,Bank bank) {
        this.userBuilder = userBuilder;
        this.bank = bank;
    }

    @Override
    public User createUser(String name, String surename, String email, List<Account> accounts,String password, Enum role) {
            userBuilder.buildUserBaseInfo(name,surename,email,accounts,password,role);
            User usr = userBuilder.buildUser();
            bank.addUser(usr);
            return usr;
        }
}

