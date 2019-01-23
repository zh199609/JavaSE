package com.zl.concurrent.future;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        DownTask downTask = new DownTask("https://blog.csdn.net/zZ_life/article/details/51318306");
        Future<String> future = executorService.submit(downTask);
        String context = future.get();//方法阻塞
        System.out.println(context);
        executorService.shutdown();
    }

}

class DownTask implements Callable<String> {
    String url;

    public DownTask(String url) {
        this.url = url;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Start download " + url + "……");
        URLConnection connection = new URL(this.url).openConnection();
        connection.connect();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));) {
            String s = null;
            StringBuilder stringBuilder = new StringBuilder();
            while ((s = bufferedReader.readLine()) != null) {
                stringBuilder.append(s);
            }
            return stringBuilder.toString();
        }
    }

    //-------------------------CompleatableFuture-------------------------------






}
