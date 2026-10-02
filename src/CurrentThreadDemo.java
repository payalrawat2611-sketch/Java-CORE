class MyTask implements Runnable {

    @Override
    public void run() {

        Thread current = Thread.currentThread();

        System.out.println("Child Thread Name: " + current.getName());
        System.out.println("Child Thread Priority: " + current.getPriority());
    }
}

public class CurrentThreadDemo {

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();

        System.out.println("Main Thread Name: " + mainThread.getName());
        System.out.println("Main Thread Priority: " + mainThread.getPriority());

        MyTask task = new MyTask();

        Thread thread = new Thread(task);
        thread.setName("My-Thread");

        thread.start();
    }
}