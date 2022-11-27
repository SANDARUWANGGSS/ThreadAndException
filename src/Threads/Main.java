package Threads;

public class Main extends Thread{
    public static void main(String[] args) {

        Test1 test1 = new Test1();
        test1.start();
        Main main = new Main();
        main.start();

        for (int i = 0; i<10 ; i++)
        {
            System.out.println("Parent Thread :"+i);
        }

    }
    public void run()
    {
        for (int j = 0; j<10 ; j++)
        {
            System.out.println("Child Thread 2 :"+j);
        }
    }
}