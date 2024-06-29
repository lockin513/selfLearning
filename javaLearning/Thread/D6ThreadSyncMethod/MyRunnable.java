package Thread.D6ThreadSyncMethod;

public class MyRunnable implements Runnable{
    int ticket = 0;
    @Override
    public void run() {
        while(true){
//            if (method()) break;
            boolean flag = method();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(flag)break;
        }
    }

    private synchronized boolean method() {
        if(ticket == 100){
            return true;
        }else {
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
        }
        return false;
    }
}
