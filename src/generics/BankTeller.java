package generics;

import util.Generator;

import java.util.*;

/**
 * FileName: BankTeller.java
 * Description:
 * Authors: wangbiwen
 * Date: 17-1-17
 */
public class BankTeller {
    public static void serve(Teller teller, Customer customer) {
        System.out.println(teller + " serves " + customer);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<Customer> line = new LinkedList<>();
        Generators.fill(line, Customer.generator(), 15);

        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers, Teller.generator(), 4);

        for (Customer customer : line) {
            serve(tellers.get(random.nextInt(tellers.size())), customer);
        }
    }
}

class Customer {
    private static long counter = 1;
    private final long id = counter++;

    private Customer() {

    }

    public String toString() {
        return "Customer " + id;
    }

    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {
    private static int counter = 1;
    private final int id = counter++;

    private Teller() {

    }

    public String toString() {
        return "Teller " + id;
    }

    public static Generator<Teller> generator() {
        return new Generator<Teller>() {
            @Override
            public Teller next() {
                return new Teller();
            }
        };
    }
}

