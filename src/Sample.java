class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class Sample {

    void main() {

        // Create thread
        MyThread thread = new MyThread();

        // Start thread
        thread.start();

        System.out.println("Main Thread");
    }
}