package com.jlab.java.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleExecutorService {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService es = Executors.newFixedThreadPool(10);
        System.out.println(coreCount);

        for(int i=0;i<coreCount;i++){
            es.execute(new MyTread());
        }
    }

}


class MyTread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(" Hi Child Thread "+i);
        }
    }
}