package multiThreading.practice.callableThreads;

import multiThreading.practice.BattingStats;
import multiThreading.practice.BowlingStats;
import multiThreading.practice.FieldingStats;

import java.util.concurrent.*;

public class CallableRunner {
    public static void main(String[] args) {
        Thread bowling  = new BowlingStats();
        BattingStats bat = new BattingStats();
        FieldingStats field = new FieldingStats();
        Thread batting  = new Thread(bat);
        Thread Fielding  = new Thread(field);

        ExecutorService ES = Executors.newFixedThreadPool(3);

        Future  fsb = ES.submit(batting);
        Future  fsbo = ES.submit(bowling);
        Future  fsf = ES.submit(Fielding);

        System.out.println("Fielding - "+fsf);
        System.out.println("Bowling "+fsbo);
        System.out.println("Batting "+fsb);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fielding - "+fsf.isDone());
        System.out.println("Bowling "+fsbo.isDone());
        System.out.println("Batting "+fsb.isDone());




    }
}

