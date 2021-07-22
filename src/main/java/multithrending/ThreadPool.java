package multithrending;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Work(i,countDownLatch));
        }
        executorService.shutdown();
        System.out.println("all tasks submitted");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Work implements Runnable {
    private int id;
    private CountDownLatch countDownLatch;

    public Work(int id,CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch=countDownLatch;
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(id);
        countDownLatch.countDown();

    }
}
