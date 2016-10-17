package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by wangbiwen on 16-9-13.
 */

class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public int changeAge() {
    public synchronized int changeAge() {
        age++;
        Thread.yield();
        age--;
        return age;
    }
}

public class ExcEleven implements Runnable{
    private People people;

    public ExcEleven(People people) {
        this.people = people;
    }

    public void run() {
        int age = people.changeAge();
        System.out.println(age);

    }

    public static void main(String[] args) {
        People people = new People("Aven", 0);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            executorService.execute(new ExcEleven(people));
        }

    }
}
