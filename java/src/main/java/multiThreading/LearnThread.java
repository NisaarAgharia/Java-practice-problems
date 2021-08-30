package multiThreading;

public class LearnThread {

    public static void main(String[] args) {

//        Thread t1 = new FirstThread();
//        SecondThread second = new SecondThread();
//        Thread t2 = new Thread(second, "hello");
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
//        t1.start();
//        t2.start();

        ThirdThread third = new ThirdThread();
        Thread t3 = new Thread(third, "thread3");

        Thread t4 = new Thread(new fourthThread(), "read4");
        System.out.println(t4.getId() + t4.getName());
        t4.start();

    }
}

