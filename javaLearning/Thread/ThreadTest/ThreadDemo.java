package Thread.ThreadTest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyThread mt = new MyThread();
//        mt.setName("mt1");
//        mt.start();

//        MyRun mr = new MyRun();
//        Thread t = new Thread(mr);
//        t.start();

        MyCallable mc = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<>(mc);
        Thread t = new Thread(ft);
        t.start();
        Integer result = ft.get();
        System.out.println(result);
    }
}
