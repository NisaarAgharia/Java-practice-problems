package multiThreading;

public class LearnThread {

    public static void main(String[] args) {
        Thread t1 = new FirstThread();
        t1.start();

        SecondThread second = new SecondThread();
        Thread t2 = new Thread(second);
        t2.start();


    }
}

