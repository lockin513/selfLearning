package Thread.D9ThreadTest.Q6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyThread extends Thread{
    static List<Integer> pool = new ArrayList<>();

    public MyThread(List<Integer> list){
        this.pool = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            synchronized (MyThread.class) {
                if(pool.isEmpty()){
                   System.out.println(getName()+list);
                    break;
                }
                else {
                    Collections.shuffle(pool);
                    Integer prize = pool.remove(0);
                    list.add(prize);
                }
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
