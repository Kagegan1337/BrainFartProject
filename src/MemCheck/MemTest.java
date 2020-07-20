package MemCheck;

import sun.misc.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class MemTest {

    public static void main(String[] args) {
        BlockingQueue<BigDumpObject> q1 = new SynchronousQueue<>();
        Runnable r_put = () -> {
            try {
                q1.put(new BigDumpObject("foo","bar"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable r_take = () -> {
            try {
                System.out.println("Before Take: "+q1.size());
                q1.take();
                System.out.println("After Take: "+ q1.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable r_remove = () -> {
            System.out.println("Before remove" + q1.size());
            q1.remove();
            System.out.println("After remove" + q1.size());
        };
        Thread t_put1 = new Thread(r_put);
        Thread t_put2 = new Thread(r_put);
        Thread t_take = new Thread(r_take);
        Thread t_remove = new Thread(r_remove);

        t_put1.start();
        try {
            t_put1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t_put2.start();
        try {
            t_put2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t_take.start();
        try {
            t_take.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t_remove.start();
        try {
            t_remove.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
