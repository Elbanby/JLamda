package beans;

public class ThreadExample {
    public static void main(String[] args) {

        // Good old way of creating thread execution
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi from thread one");
            }
        });
        th1.start();

        // Lets use lambdas now!
        Thread th2 = new Thread(() -> System.out.println("I am thread 2"));
        th2.start();

    }
}

