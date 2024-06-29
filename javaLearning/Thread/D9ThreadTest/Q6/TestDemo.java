package Thread.D9ThreadTest.Q6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);
        MyThread t1 = new MyThread(list);
        MyThread t2 = new MyThread(list);
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");
        t1.start();
        t2.start();
    }
}
