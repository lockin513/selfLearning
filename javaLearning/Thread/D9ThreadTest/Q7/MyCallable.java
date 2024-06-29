package Thread.D9ThreadTest.Q7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    static List<Integer> pool = new ArrayList<>();

    public MyCallable(List<Integer> list){
        this.pool = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            synchronized (MyCallable.class) {
                if(pool.isEmpty()){
                    System.out.println(Thread.currentThread().getName()+list);
                    break;
                }
                else {
                    Collections.shuffle(pool);
                    Integer prize = pool.remove(0);
                    list.add(prize);
                }
            }
            Thread.sleep(100);
        }
        if(list.isEmpty())return null;
        Integer max = Collections.max(list);
        return max;
    }
}
