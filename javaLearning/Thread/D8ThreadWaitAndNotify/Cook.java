package Thread.D8ThreadWaitAndNotify;

public class Cook extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.flag==0){
                    if(Desk.count>0){
                        Desk.flag = 1;
                        System.out.println("厨师又做了一碗饭");
                        Desk.lock.notifyAll();
                    }
                    else break;
                } else {
                    try {
                        Desk.lock.wait();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
