package Thread.D8ThreadWaitAndNotify;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Desk {
    public static int flag = 0;
    public static Lock lock = new ReentrantLock();
    public static int count = 10;
}
