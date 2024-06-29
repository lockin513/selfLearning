package Thread.D2ThreadCreat2;

public class MyRun implements Runnable{
    @Override
    public void run() {
        // 获取到当前线程的对象（因为没有继承Thread类，无法直接使用getName方法）
        Thread t = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName()+"hello world");
        }
    }
}
