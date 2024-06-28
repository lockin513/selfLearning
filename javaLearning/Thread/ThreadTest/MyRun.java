package Thread.ThreadTest;

public class MyRun implements Runnable{
    Thread t = Thread.currentThread();
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(t.getName()+i);
        }
    }
}
