package Thread.D3ThreadCreat3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建MyCallable对象（表示多线程要执行的任务）
        MyCallable mc = new MyCallable();
        // 创建FutrueTask对象（用于管理多线程运行的结果）
        FutureTask<Integer> ft = new FutureTask<>(mc);
        // 创建线程的对象
        Thread t = new Thread(ft);
        t.start();
        // 获取多线程的运行结果
        Integer result = ft.get();
        System.out.println(result);
    }
}
