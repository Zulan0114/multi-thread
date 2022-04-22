package com.example.multithread.threadcommunication.producerconsumer;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        String lock = "123456789";
        final Producer producer = new Producer(lock);
        final Consumer consumer = new Consumer(lock);
        Runnable produceRunnable = new Runnable() {
            public void run() {
                while (true) {
                    producer.produceValue();
                }
            }
        };
        Runnable consumeRunnable = new Runnable() {
            public void run() {
                while (true) {
                    consumer.consumeValue();
                }
            }
        };
        Thread produceThread = new Thread(produceRunnable);
        Thread consumeThread = new Thread(consumeRunnable);
        produceThread.start();
        consumeThread.start();
    }
}
