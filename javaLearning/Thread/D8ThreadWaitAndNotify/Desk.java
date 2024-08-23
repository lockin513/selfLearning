package Thread.D8ThreadWaitAndNotify;

import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Desk {
   static int foodflag = 0;
   static Object lock = new Object();
   static int count = 10;
}
