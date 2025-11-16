package Operations;

import Users.*;

public class AssignPremiumAccount implements Operation {
    private User user;
    public AssignPremiumAccount(User user) {
        this.user = user;
    }
    @Override
    public void execute() {

        if (user == null) {
            System.out.println("Cant assign premium account (user not found)");
            return;
        }
        user.addPremiumAccount();
    }
}
