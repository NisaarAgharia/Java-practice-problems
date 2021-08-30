package multiThreading.practice;

public class GMThread implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<999;i++)
        {
            try {
              //  Thread.sleep(1);
                if (i>500)
                {
                    Thread.currentThread().interrupt();
                }

                System.out.println(Thread.currentThread().getState());
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Good Morning");
        }
    }
}
