class MyTask implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Child Thread: " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadJoinDemo {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread thread = new Thread(task);

        thread.start();

        try {
            // Main thread waits for child thread
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Executes after child thread finishes
        System.out.println("Main Thread finished.");
    }
}
