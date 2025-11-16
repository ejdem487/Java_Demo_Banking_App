package Account;

public class PremiumAccount extends Account { //doplnujeme konkretni hodnoty do kontruktoru
    public PremiumAccount (){
        super(AccountNumberGenerator.getInstance().generateAccountNumber(),0,AccType.PREMIUMACCOUNT);
    }

    @Override
    public void printInfo()
    {
        System.out.println("Account type: "+getAccType()+"\n account number: "+getAccountNumber()+"\n balance: "+getBalance()+"\n bank code: "+getBankCode());


    }
}
