package com.example.concurrency;

class Consumer implements Runnable {
    private SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer sharedBuffer) {
        this.sharedBuffer = sharedBuffer;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = sharedBuffer.removeItem();
            sum += num;
            try {
                Thread.sleep(500); // Sleep for a fixed duration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum of consumed numbers: " + sum);
    }
}
