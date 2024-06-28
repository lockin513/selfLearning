package Thread.ThreadSynchronized;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.setName("1号窗口");
        t2.setName("2号窗口");
        t3.setName("3号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
