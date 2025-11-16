package Operations;

import Bank.Bank;
import Users.*;

import java.util.Scanner;

public class AssignNormalAccount implements Operation {
    private User user;
    public  AssignNormalAccount(User user) {
        this.user = user;
    }





    @Override
    public void execute() {
    if (user == null) {
        System.out.println("Can't assign normal account (user not found)");
        return;
    }
    user.addNormalAccount();
        System.out.println("NormalAccount assigned:\naccount number: "+user.findPayingAccount().getAccountNumber());
    }
}
