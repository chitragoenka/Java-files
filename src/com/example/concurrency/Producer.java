package com.example.concurrency;

import java.util.Random;
class Producer implements Runnable {
    private SharedBuffer sharedBuffer;

    public Producer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100);
            sharedBuffer.addItem(num);
            try {
                Thread.sleep(random.nextInt(1000)); // Sleep for a random duration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
