package org.example.thread.example2;

/**
 * Threads allows a program to operate more efficiently by doing multiple things at the same time.
 * Threads can be used to perform complicated tasks in the background without interrupting the main program.
 *
 * Mostly used in :- games, animations
 *
 * This Thread created by extending the Thread class and overriding its run() method
 *
 */
public class ThreadClass1 extends Thread {

    public void run() {
        System.out.println("This code is running in a thread");
    }


}
