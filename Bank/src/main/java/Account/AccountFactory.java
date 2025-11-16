package Account;

public class  AccountFactory {
   public static Account createSavingsAccount(){
       return new SavingsAccount();
   }
   public static Account createNormalAccount(){
       return new NormalAccount();
   }
   public static Account createPremiumAccount(){
       return new PremiumAccount();
   }
}

