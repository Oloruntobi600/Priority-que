package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
//    public static void main(String[] args) {
//        PriorityQueue<Integer>priorityQueue = new PriorityQueue<>();
//        priorityQueue.add(6);
//        priorityQueue.add(1);
//        priorityQueue.add(2);
//        priorityQueue.add(4);
//
//        System.out.println(priorityQueue);
//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue);
//    }

    //to reversed order
//    public static void main(String[] args) {
//        PriorityQueue<Integer>priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
//        priorityQueue.add(6);
//        priorityQueue.add(1);
//        priorityQueue.add(2);
//        priorityQueue.add(4);
//
//        System.out.println(priorityQueue);
//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue);
//    }
    public static void main(String[] args) {
        Queue<Customer> customers = new PriorityQueue<>(new CustomerOrder());

        customers.add(new Customer(6, 50.0, "Tobi"));
        customers.add(new Customer(2, 100.0, "Sola"));
        customers.add(new Customer(1, 70.0, "Bode"));
        System.out.println(customers);
        System.out.println(customers.poll());
        System.out.println(customers);
    }

}