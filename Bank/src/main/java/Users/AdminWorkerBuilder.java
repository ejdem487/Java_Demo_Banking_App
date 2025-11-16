package Users;

import Account.Account;

import java.util.List;

public class AdminWorkerBuilder implements UserBuilder {
    private User user;

    public AdminWorkerBuilder() {
        this.user = new User();
    }

    @Override
    public User buildUser() {
        User builtUser = this.user;
        this.user = new User();
        return builtUser;
    }

    @Override
    public void buildUserBaseInfo(String name, String surename, String email, List<Account> accounts,String password, Enum role) {
        this.user.setName(name);
        this.user.setSurename(surename);
        this.user.setEmail(email);
        this.user.setAccounts(accounts);
        this.user.setPassword(password);
        this.user.setRole(role);

    }
}
