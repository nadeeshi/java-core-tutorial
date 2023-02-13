package org.example.thread.producerConsumerProblem;

import java.util.LinkedList;

/**
 *  producer adds items to list and consumer removes items from list
 *
 *  Problem:-
 *      To make sure that the producer won’t try to add data into the buffer if it’s full and
 *      that the consumer won’t try to remove data from an empty buffer.
 *
 *  Solution:-
 *      The producer is to either go to sleep or discard data if the buffer is full.
 *      The next time the consumer removes an item from the buffer, it notifies the producer, who starts to fill the buffer again.
 *
 *      In the same way, the consumer can go to sleep if it finds the buffer to be empty.
 *      The next time the producer puts data into the buffer, it wakes up the sleeping consumer.
 *
 *  An inadequate solution could result in a deadlock where both processes are waiting to be awakened.
 */
public class Shop {

    LinkedList<String> list = new LinkedList<>();

    //size of list
    int capacity = 5;

    @SuppressWarnings("squid:S2189")
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == capacity) {
                    wait();
                }

                System.out.println("Producer produced- " + value);

                list.add(Integer.toString(value++));

                notifyAll();
                Thread.sleep(1000);
            }
        }
    }

    @SuppressWarnings("squid:S2189")
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.isEmpty()) {
                    wait();
                }

                int val = Integer.parseInt(list.removeFirst());

                System.out.println("Consumer consumed- " + val);

                notifyAll();
                Thread.sleep(1000);
            }
        }
    }
}
