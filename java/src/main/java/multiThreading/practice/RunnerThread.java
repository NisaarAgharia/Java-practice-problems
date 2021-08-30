package multiThreading.practice;

public class RunnerThread {
    public static void main(String[] args) {

        GMThread gm = new GMThread();
        Thread gmthread  = new Thread(gm);

        Thread hthread = new HelloThread();
        gmthread.start();
        hthread.start();

    }
}
