package Thread.D9ThreadTest.Q4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class People extends Thread{
    public static Lock lock = new ReentrantLock();
    public static double value = 100;
    public static int count = 3;
    @Override
    public void run() {
        while(true){
            synchronized (lock){
                if(count==0){
                    System.out.println(getName()+"没有抢到红包");
                    break;
                }else {
                    if(count==3){
                        System.out.println(getName()+"抢到了50块钱");
                        value-=50;
                        count--;
                        break;
                    }else if(count==2){
                        System.out.println(getName()+"抢到了30块钱");
                        value-=30;
                        count--;
                        break;
                    }else {
                        System.out.println(getName()+"抢到了20块钱");
                        value-=20;
                        count--;
                        break;
                    }
                }
            }
        }
    }
}
