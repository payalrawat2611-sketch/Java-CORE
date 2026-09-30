class MyTask implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class RunnableDemo {

    public static void main(String[] args) {

        // Create Runnable object
        MyTask task = new MyTask();

        // Pass Runnable object to Thread
        Thread thread = new Thread(task);

        // Start thread
        thread.start();

        System.out.println("Main Thread");
    }
}