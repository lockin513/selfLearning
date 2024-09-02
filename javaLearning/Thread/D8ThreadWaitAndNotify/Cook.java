package Thread.D8ThreadWaitAndNotify;

public class Cook extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count==0)break;
                if(Desk.foodflag==1){
                    try {
                        Desk.lock.wait();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("厨师做了一碗面条");
                Desk.foodflag=1;
                Desk.lock.notifyAll();
            }
        }
    }
}
