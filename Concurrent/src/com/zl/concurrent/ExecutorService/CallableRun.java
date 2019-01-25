package com.zl.concurrent.ExecutorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @Author
 * @Description
 * @Date
 */
public class CallableRun {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Callable> callableList = new ArrayList<>();
        callableList.add(new MyCallableA());
        callableList.add(new MyCallableB());
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        ScheduledFuture scheduledFutureA = executorService.schedule(callableList.get(0), 4L, TimeUnit.MILLISECONDS);
        ScheduledFuture scheduledFutureB = executorService.schedule(callableList.get(1), 4L, TimeUnit.MILLISECONDS);
        System.out.println("-------------------");
        System.out.println("A返回值："+scheduledFutureA.get());
        System.out.println("B返回值："+scheduledFutureB.get());
        executorService.shutdown();

    }

}

class MyCallableA implements Callable<String> {
    @Override
    public String call() throws Exception {
        try {
            System.out.println("callA begin " + Thread.currentThread().getName() + ", " + System.currentTimeMillis());
            TimeUnit.SECONDS.sleep(3); // 休眠3秒
            System.out.println("callA end " + Thread.currentThread().getName() + ", " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "returnA";
    }
}

class MyCallableB implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("callB begin " + Thread.currentThread().getName() + ", " + System.currentTimeMillis());
        System.out.println("callB end " + Thread.currentThread().getName() + ", " + System.currentTimeMillis());
        return "returnB";
    }
}
