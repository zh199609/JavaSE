package com.zl.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest {

    /**
     * @param corePoolSize  核心线程数
     * @param maximumPoolSize 最大线程数
     * @param keepAliveTime 线程所允许的空闲时间
     * @param unit 线程所允许的空闲时间的单位
     * @param workQueue  线程池所使用的缓冲队列
     * @param handler 线程池对拒绝任务的处理策略
     */
/*    ThreadPoolExecutor(int corePoolSize,
                       int maximumPoolSize,
                       long keepAliveTime,
                       TimeUnit unit,
                       BlockingQueue<Runnable> workQueue,
                       RejectedExecutionHandler handler)*/
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>(60));

    Future<String> future = threadPoolExecutor.submit(new Callable<String>() {
        @Override
        public String call() throws Exception {
            return "ok";
        }
    });
}
