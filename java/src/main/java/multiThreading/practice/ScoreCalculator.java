package multiThreading.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScoreCalculator {

    public void mergeAndAnalyse(){
        System.out.println("-------------Merge And Analysing!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    public static void main(String[] args) {


        Thread bowling  = new BowlingStats();
        BattingStats bat = new BattingStats();
        FieldingStats field = new FieldingStats();
        Thread batting  = new Thread(bat);
        Thread Fielding  = new Thread(field);
        ScoreCalculator score = new ScoreCalculator();

batting.start();
bowling.start();
Fielding.start();

        try {
            batting.join();
            bowling.join();
            Fielding.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        score.mergeAndAnalyse();


        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
        try {
           // executorService1.shutdownNow();

        } catch (Exception e) {
            e.printStackTrace();
        }

        executorService1.submit(batting);

    //    executorService1.submit(bowling);
        executorService1.submit(Fielding);

        //executorService1.shutdown();
    }

}
