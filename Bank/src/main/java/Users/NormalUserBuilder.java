package Users;

import Account.Account;
import Account.AccountFactory;
import java.util.List;

public class NormalUserBuilder implements UserBuilder {
    private User user;

    public NormalUserBuilder() {
        this.user = new User();
    }


    @Override
    public void buildUserBaseInfo(String name, String surename, String email,List<Account> accounts,String password,Enum role) {
    user.setName(name);
    user.setSurename(surename);
    user.setEmail(email);
    user.setAccounts(accounts);
    user.setPassword(password);
    user.setRole(role);

    }



    @Override
    public User buildUser() {
        User builtUser = this.user;
        this.user = new User();
        return builtUser;
    }
}
