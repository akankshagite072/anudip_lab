package thursday_lab;

import java.util.Scanner;

public class ThreadPriority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of threads to create:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Thread thread = new Thread(() -> {
                // Simulate some work in the thread
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            System.out.println("Enter name for thread " + i + ":");
            String threadName = scanner.next();
            thread.setName(threadName);

            System.out.println("Enter priority (1-10) for thread " + threadName + ":");
            int pr = scanner.nextInt();
            pr = Math.max(Thread.MIN_PRIORITY, Math.min(Thread.MAX_PRIORITY, pr));
            thread.setPriority(pr);

            thread.start();
        }

        // Wait for all threads to finish
        waitForThreadsToFinish();

        displayRunningThreads();
        scanner.close();
    }

    private static void waitForThreadsToFinish() {
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        while (mainGroup.activeCount() > 1) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void displayRunningThreads() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);
        System.out.println("Listing all running threads with priorities:");
        for (Thread thread : threads) {
            if (thread != null) {
                System.out.println("Thread name: " + thread.getName());
                System.out.println("Thread ID: " + thread.getId() + "\nThread Priority: " + thread.getPriority());
                System.out.println();
            }
        }
    }
}
