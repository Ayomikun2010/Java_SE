package fundamentals.datatypes;

public class BankApp {
    public static void main(String[] args){
        BankAccount acct1 = new BankAccount();
        acct1.setAccountNumber(987545678);
        int num = acct1.getAccountNumber();
        System.out.println(num);

        acct1.setAccountOwnerName("Ayomikun");
        String name = acct1.getAccountOwnerName();
        System.out.println(name);

        acct1.setAccountBalance(500.25);
        double bal = acct1.getAccountBalance();
        System.out.println(bal);




//        System.out.print(BankAccount);
    }

}







