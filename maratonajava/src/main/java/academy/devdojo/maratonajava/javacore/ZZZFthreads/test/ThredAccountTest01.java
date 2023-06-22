package academy.devdojo.maratonajava.javacore.ZZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZZFthreads.dominio.Account;

public class ThredAccountTest01 implements Runnable {

    private Account account = new Account(100);

    public static void main(String[] args) {
        ThredAccountTest01 thredAccountTest01 = new ThredAccountTest01();
        Thread t1 = new Thread(thredAccountTest01, "Hestia");
        Thread t2 = new Thread(thredAccountTest01, "Marcelle");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Erro");
            }
        }
    }

//    private synchronized void withdrawal(int amount) {
//        if (account.getBalance() >= amount) {
//            System.out.println(getThreadName() + " está indo sacar dinheiro");
//            account.withdrawal(amount);
//                System.out.println(getThreadName() + " completou o saque, valor atual " + account.getBalance());
//        } else {
//            System.out.println(getThreadName() + " não completou o saque, saldo insuficiente");
//        }
//
//    }

    private void withdrawal(int amount) {
        System.out.println(getThreadName() + "Fora do synchronized");
        synchronized (account){
            System.out.println(getThreadName() + "Dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar dinheiro");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, valor atual " + account.getBalance());
            } else {
                System.out.println(getThreadName() + " não completou o saque, saldo insuficiente");
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
