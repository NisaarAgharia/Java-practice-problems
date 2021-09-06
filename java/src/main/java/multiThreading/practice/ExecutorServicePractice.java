package multiThreading.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServicePractice {
    public static void main(String[] args) {
        Thread bowling  = new BowlingStats();
        BattingStats bat = new BattingStats();
        FieldingStats field = new FieldingStats();
        Thread batting  = new Thread(bat);
        Thread Fielding  = new Thread(field);

        ExecutorService es = Executors.newFixedThreadPool(5);

        es.submit(bowling);
        es.submit(batting);
        es.submit(Fielding);

        es.shutdown();



    }
}
