package com.zl.concurrent.ExecutorService;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);


    }


    @Test
    public void testScheduledExecutorService() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        //scheduleAtFixedRate  方法周期性执行
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            System.out.println("run" + System.currentTimeMillis());
        }, 0, 100, TimeUnit.MILLISECONDS);

    }
}
