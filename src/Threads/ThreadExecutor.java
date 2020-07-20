package Threads;

import Threads.Tasks.Task1;
import Threads.Tasks.Task2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadExecutor {

    public static void main(String[] args){
        ExecutorService executorService = new ExecutorService();
        executorService.startThreads();
    }
}
