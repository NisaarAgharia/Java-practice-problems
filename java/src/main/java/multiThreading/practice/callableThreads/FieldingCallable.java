package multiThreading.practice.callableThreads;

public class FieldingCallable implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i<100; i++)
        {
            System.out.println("Calculation Fielding Stats - " + i);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
