package fundamentals.datatypes;

public class BankAccount {
   private int accountNumber;
   private double accountBalance;
   private String accountOwnerName;

   public void setAccountNumber(int accountNumber){
       this.accountNumber = accountNumber;
   }

   public void setAccountBalance(double accountBalance){
       this.accountBalance = accountBalance;
   }

   public void setAccountOwnerName(String accountOwnerName){
       this.accountOwnerName = accountOwnerName;
   }

   public int getAccountNumber(){
       return this.accountNumber;
   }

   public double getAccountBalance(){
       return this.accountBalance;
   }
   public String getAccountOwnerName(){
       return this.accountOwnerName;
   }

}
