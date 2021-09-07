package multiThreading.practice.callableThreads;

import java.util.concurrent.Callable;

public class BowlingCallable implements Callable {
    @Override
    public Object call() throws Exception {
        int i=0;
        for( ; i<100; i++)
        {
            System.out.println("Calculation Bowling Stats - " + i);
            Thread.sleep(20);
        }
        return i;
    }
}
