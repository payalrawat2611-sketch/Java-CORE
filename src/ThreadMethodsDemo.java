class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Child Thread is running.");
    }
}

public class ThreadMethodsDemo {

    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread thread = new Thread(task);

        // Set thread name
        thread.setName("My-Thread");

        // Set thread priority
        thread.setPriority(Thread.MAX_PRIORITY);

        // Check thread details before starting
        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread Priority: " + thread.getPriority());
        System.out.println("Before start: " + thread.isAlive());

        thread.start();

        // Check thread after starting
        System.out.println("After start: " + thread.isAlive());
    }
}