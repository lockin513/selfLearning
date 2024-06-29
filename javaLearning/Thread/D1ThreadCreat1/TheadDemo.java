package Thread.D1ThreadCreat1;

public class TheadDemo {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();
    }
}
