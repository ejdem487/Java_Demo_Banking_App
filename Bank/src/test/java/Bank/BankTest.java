package Bank;

import Account.Account;
import Users.User;
import Users.UserType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BankTest {

    @Test
    public void testBank() {
        Bank bank =  new Bank();
        //je cervene protoze je proteced a slouzi jen k testum
        User user = new User();
        user.setName("David");
        user.setSurename("Mocen");
        user.setEmail("dm@seznam.cz");
        user.setPassword("passwd123");
        user.setRole(UserType.NORMALUSER);
        bank.addUser(user);        bank.addUser(user);
        assertTrue(bank.isUser("dm" + "@seznam.cz"));
        assertFalse(user.findNormalAccount());
    }


}