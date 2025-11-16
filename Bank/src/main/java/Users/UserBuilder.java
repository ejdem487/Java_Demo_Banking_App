package Users;
import Account.Account;

import java.util.ArrayList;
import java.util.List;

public interface UserBuilder {

    public User buildUser();

    public  void buildUserBaseInfo(String name, String surename, String email, List<Account> accounts,String password,Enum role);




}
