package Threads.Tasks;

public class Task2 implements Runnable{

    private int count;

    public Task2(){
        count = 0;
    }

    @Override
    public void run() {
        System.out.println("Here is task 2 " + count);
        count++;
    }
}
