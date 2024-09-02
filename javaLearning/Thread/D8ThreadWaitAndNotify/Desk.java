package Thread.D8ThreadWaitAndNotify;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Desk {
   public static int count = 10;
   public static int foodflag = 0;
   public static Object lock = new Object();
}
