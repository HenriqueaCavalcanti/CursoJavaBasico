package academy.devdojo.maratonajava.javacore.ZZZFthreads.test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ThreadSafeNames{
    private final List<String> names = new ArrayList<>();

    public synchronized void add(String name){
        names.add(name);
    }

    public synchronized void removeFirst(){
        if (names.size() > 0){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        StringBuffer stb = new StringBuffer();

        ThreadSafeNames threadSafeNames = new ThreadSafeNames();
        threadSafeNames.add("Henrique");

        System.out.println(threadSafeNames);
        Runnable r  = threadSafeNames::removeFirst;

        new Thread(r).start();
        new Thread(r).start();
    }
}
