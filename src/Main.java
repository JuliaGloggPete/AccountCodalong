public class Main {
    public static void main(String[] args) {

        // main funktionen är en special funktion som körs automatiskt - den är lite special
        //static --

        Account salaryAccount = new Account();
        Account savingAccount = new Account(1000.00);

        salaryAccount.deposit(100);
        savingAccount.deposit(200);

        Double money = salaryAccount.withdraw(50);// varför stort Double
        System.out.println(money); // varför kan jag inte pusha upp 

        System.out.println(salaryAccount.getBalance());
        System.out.println(savingAccount.getBalance());







    }
}