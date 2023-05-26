package com.example.concurrency;

import java.util.ArrayList;
import java.util.List;

class SharedBuffer {
    private List<Integer> buffer;
    private int maxSize;

    public SharedBuffer(int maxSize) {
        this.buffer = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public synchronized void addItem(int item)  {
        while (buffer.size() >= maxSize) {
            try {
                wait(); // Buffer is full, wait for consumer to consume items
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        buffer.add(item);
        System.out.println("Producer produced: " + item);
        notifyAll(); // Notify consumer that new item is available
    }

    public synchronized int removeItem() {
        while (buffer.isEmpty()) {
            try {
                wait(); // Buffer is empty, wait for producer to produce items
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int item = buffer.remove(0);
        System.out.println("Consumer consumed: " + item);
        notifyAll(); // Notify producer that space is available in the buffer
        return item;
    }
}
