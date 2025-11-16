package Account;

public class NormalAccount extends Account { //doplnujeme konkretni hodnoty do kontruktoru
    public NormalAccount (){
        super(AccountNumberGenerator.getInstance().generateAccountNumber(),0,AccType.NORMALACCOUNT);
    }

    @Override
    public void printInfo()
    {
        System.out.println("Account type: "+getAccType()+"\n account number: "+getAccountNumber()+"\n balance: "+getBalance()+"\n bank code: "+getBankCode());


    }
}
