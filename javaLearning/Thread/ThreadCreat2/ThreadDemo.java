package Thread.ThreadCreat2;

public class ThreadDemo {
    public static void main(String[] args) {
        MyRun my = new MyRun();
        MyRun my2 = new MyRun();

        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my2);

        t1.setName("thread-1");
        t2.setName("thread-2");

        t1.start();
        t2.start();
    }
}
