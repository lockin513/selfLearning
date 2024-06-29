package Thread.D5ThreadSynchronized;

public class MyThread extends Thread{
    static int ticket = 0;
    static Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj) {
                if (ticket < 100) {
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
