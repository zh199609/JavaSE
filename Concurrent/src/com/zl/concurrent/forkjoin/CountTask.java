package com.zl.concurrent.forkjoin;

import sun.security.provider.Sun;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * @Author
 * @Description
 * @Date
 */
public class CountTask extends RecursiveTask<Integer> {

    private static final int THRESHOLD = 2;
    private int start;
    private int end;


    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }


    @Override
    protected Integer compute() {
        int sum = 0;
        boolean canCompute = (end - start) <= THRESHOLD;
        //如果任务足够小就计算任务
        if (canCompute) {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            //如果任务大于阀值，就分裂成两个子任务计算
            int middle = (start + end) / 2;
            CountTask countTask1 = new CountTask(start, middle);
            CountTask countTask2 = new CountTask(middle + 1, end);
            //执行子任务
            countTask1.fork();
            countTask2.fork();

            //等待任务执行完，并得到结果
            Integer join1 = countTask1.join();
            Integer join2 = countTask2.join();
            sum = join1 + join2;
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        //生成一个计算任务,1+2+3+4
        CountTask countTask = new CountTask(1, 4);
        ForkJoinTask<Integer> submit = forkJoinPool.submit(countTask);
        System.out.println(submit.get());
    }
}
