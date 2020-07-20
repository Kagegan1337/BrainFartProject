package Threads;

import Threads.Tasks.Task1;
import Threads.Tasks.Task2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ExecutorService {
    private Task1 task1;
    private Task2 task2;
    private ScheduledExecutorService ses;
    private ScheduledFuture task1Executor;
    private ScheduledFuture task2Executor;

    public ExecutorService() {
        ses = Executors.newScheduledThreadPool(2);
        task1 = new Task1();
        task2 = new Task2();
    }

    public void startThreads(){
        task1Executor = ses.scheduleAtFixedRate(task1, 0, 8, TimeUnit.SECONDS);
        task2Executor = ses.scheduleAtFixedRate(task2, 0, 3, TimeUnit.SECONDS);
        System.out.println(this.getClass().getSimpleName() + " Started all threads");
    }

    public void stopThreads(){
        task1Executor.cancel(true);
        task2Executor.cancel(true);
        ses.shutdown();
    }

}
