package Thread.D8ThreadWaitAndNotify;

public class Foodie extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count == 0)break;
                else {
                    if(Desk.flag==1){
                        Desk.count--;
                        System.out.println("吃货吃了1碗米饭，还能再吃"+Desk.count+"碗");
                        Desk.flag=0;
                        Desk.lock.notify();
                    }else {
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
}
