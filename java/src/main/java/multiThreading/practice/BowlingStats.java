package multiThreading.practice;

public class BowlingStats extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i<100; i++)
        {
            System.out.println("Calculation Bowling Stats - " + i);
        }
    }

}
