package org.example.thread.example2;

/**
 * This Thread created by implementing the Runnable interface
 */
public class ThreadClass2 implements Runnable {

    @Override
    public void run() {
        System.out.println("This code is running in a thread");
    }
}
