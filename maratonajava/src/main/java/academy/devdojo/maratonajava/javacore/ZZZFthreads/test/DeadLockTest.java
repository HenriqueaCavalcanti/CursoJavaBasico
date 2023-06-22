package academy.devdojo.maratonajava.javacore.ZZZFthreads.test;

public class DeadLockTest {
    public static void main(String[] args) {



        Object lock = new Object();
        Object lock2 = new Object();

        Runnable r = () -> {
            synchronized (lock) {
                System.out.println("Thread 1: Segurando lock 1");
                System.out.println("Thread 1: Esperando lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1: segurando lock 2");
                }
            }
        };

        Runnable r2 = () -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Segurando lock 2");
                System.out.println("Thread 2: Esperando lock 1");
                synchronized (lock) {
                    System.out.println("Thread 2: segurando lock 1");
                }
            }
        };
        new Thread(r).start();
        new Thread(r2).start();
    }
}


