package org.example.thread.example2;

public class MainApp {

    public static void main(String[] args) {

        // If the class extends the Thread class, the thread can be run by creating an instance of the class and
        // call its start() method:
        ThreadClass1 thread1 = new ThreadClass1();
        thread1.start();
        System.out.println("This code is outside of the thread");


        // If the class implements the Runnable interface, the thread can be run by passing an instance of the class to
        // a Thread object's constructor and then calling the thread's start() method
        ThreadClass2 thread2 = new ThreadClass2();
        Thread thread = new Thread(thread2);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
}
