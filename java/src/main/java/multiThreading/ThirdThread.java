package multiThreading;

public class ThirdThread implements  Runnable{

    @Override
    public void run() {
        System.out.println("I am coming from third thread");
    }
}
