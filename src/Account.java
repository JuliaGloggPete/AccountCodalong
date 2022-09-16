public class Account {

    private double balance;
    private String name;


    //konstruktötrer se ut som metoder men de är special metoder som när vi är ute från vår klass skapa object

    // konstruktören heter ALLTID samma som klassen
    public Account (){
        this.balance = 0.0;
    }

    public Account(double startBalance){
        this.balance = startBalance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount){
        this.balance += amount;
        //balance = balance + amount;
    }

    public double withdraw(double amount){

        if (this.balance>= amount && amount > 0){
        this.balance -= amount;
        return amount;}
        return 0;


    }



}
