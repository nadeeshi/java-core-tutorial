package org.example.thread.producerConsumerProblem;

/**
 * Consumer thread - consumer will remove item
 */
public class Consumer extends Thread {
    private Shop shop;

    public Consumer(Shop newShop) {
        shop = newShop;
    }

    @Override
    public void run() {
        try {
            shop.consume();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
