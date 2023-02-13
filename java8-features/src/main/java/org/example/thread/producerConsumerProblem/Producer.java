package org.example.thread.producerConsumerProblem;

/**
 * Producer thread - producer will add item
 */
public class Producer extends Thread {

    private Shop shop;

    public Producer(Shop newShop) {
        shop = newShop;
    }

    @Override
    public void run() {
        try {
            shop.produce();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
