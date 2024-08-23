package Thread.D8ThreadWaitAndNotify;


public class Foodie extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if(Desk.count==0)break;
                else
                {
                    if(Desk.foodflag==0){
                        try {
                            Desk.lock.wait();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    }
                    else
                    {
                        System.out.println("吃货正在吃面条,还能再吃"+--Desk.count+"碗");
                        Desk.foodflag=0;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
