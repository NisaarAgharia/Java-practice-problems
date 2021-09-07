package multiThreading.practice.callableThreads;

import java.util.concurrent.Callable;

public class BattingCallable implements Callable {
    @Override
    public Object call() throws Exception {
        for(int i = 0 ; i<100; i++)
        {
            System.out.println("Calculation Batting Stats - " + i);
            Thread.sleep(10);
        }
        return true;
    }
}
