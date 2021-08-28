package multiThreading;

public class SecondThread implements  Runnable{

    @Override
    public void run() {
        for (int i=0;i<1000;i++)
        {
            System.out.println("i am coming from thread 2 "+ i);
        }
    }
}
