package Thread.ThreadMethod;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new MyThread("mythread");
        t.setName("myThread");
        t.start();

        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());

        System.out.println("111");
        Thread.sleep(5000);
        System.out.println("222");
    }
}
