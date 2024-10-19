package Thread.ThreadTest;

import java.util.Objects;
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread {
    public static int ticket = 0;
    public static ReentrantLock lock = new ReentrantLock();
    public static int id = 1;

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                String str = "窗口"+id;
                if (Objects.equals(currentThread().getName(), str)) {
                    if (ticket == 100) {
                        id = id % 3 + 1;
                        break;
                    }
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "正在买第" + ticket + "张票");
                    id = id % 3 + 1;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}