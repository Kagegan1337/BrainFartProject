package Threads.Tasks;

public class Task1 implements Runnable{

    private int count;

    public Task1(){
        count = 0;
    }

    @Override
    public void run() {
        System.out.println("Here is task 1 " + count);
        count++;
    }
}
