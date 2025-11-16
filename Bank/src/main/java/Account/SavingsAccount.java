package Account;

public class SavingsAccount extends Account { //doplnujeme konkretni hodnoty do kontruktoru
    public SavingsAccount (){
        super(AccountNumberGenerator.getInstance().generateAccountNumber(),0,AccType.SAVINGSACCOUNT);

    }


    @Override
    public void printInfo()
    {
        System.out.println("Account type: "+getAccType()+"\n account number: "+getAccountNumber()+"\n balance: "+getBalance()+"\n bank code: "+getBankCode());


    }
}
