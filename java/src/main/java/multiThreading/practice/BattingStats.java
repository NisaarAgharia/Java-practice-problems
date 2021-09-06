package multiThreading.practice;

public class BattingStats implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i<100; i++)
        {
            System.out.println("Calculation Batting Stats - " + i);
        }
    }
}
