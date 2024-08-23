package Thread.D5ThreadSynchronized;

public class MyThread extends Thread{
    static int ticket = 0;
    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class) {
                if(ticket>=100)break;
                else System.out.println(getName()+"正在卖出第"+ ++ticket +"张票");
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
