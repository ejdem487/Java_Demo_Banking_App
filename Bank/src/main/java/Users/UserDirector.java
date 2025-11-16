package Users;

import Account.*;
import java.util.ArrayList;
import java.util.List;

public interface UserDirector {


        public User createUser(String name, String surename, String email, List<Account> accounts,String password,Enum role);




}
