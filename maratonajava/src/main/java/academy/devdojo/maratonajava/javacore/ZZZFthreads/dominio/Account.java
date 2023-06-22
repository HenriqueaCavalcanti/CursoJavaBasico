package academy.devdojo.maratonajava.javacore.ZZZFthreads.dominio;

public class Account {
    private int balance = 50;

    public Account(){
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public void withdrawal(int amount){
       this.balance = balance - amount;
    }

    public int getBalance() {
        return balance;
    }
}
