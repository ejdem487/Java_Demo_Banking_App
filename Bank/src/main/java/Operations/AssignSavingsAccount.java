package Operations;

import Users.User;

public class AssignSavingsAccount implements Operation {
    private User user;
    public AssignSavingsAccount(User user) {
        this.user = user;
    }
    @Override
    public void execute() {
        if (user == null) {
            System.out.println("Cant assign savings account (user not found)");
        return;
        }
        user.addSavingsAccount();
    }
}
