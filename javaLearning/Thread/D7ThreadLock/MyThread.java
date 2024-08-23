package Thread.D7ThreadLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static int ticket = 0;
    static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            if(ticket>=100)break;
            else System.out.println(getName()+"正在卖出第"+ ++ticket +"张票");
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }
        }
    }
}
