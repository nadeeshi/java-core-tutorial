package org.example.thread.producerConsumerProblem;

/**
 * The producer-consumer problem (also known as the bounded-buffer problem) is a classic example of a multi-process synchronization problem.
 * The problem describes two processes, the producer and the consumer, which share a common, fixed-size buffer used as a queue.
 *
 * The producer’s job is to generate data, put it into the buffer, and start again.
 * At the same time, the consumer is consuming the data (i.e. removing it from the buffer), one piece at a time.
 */
public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {
        Shop shop = new Shop();
        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);

        //both thread start
        producer.start();
        consumer.start();

//        producer.join();
//        consumer.join();
    }
}
