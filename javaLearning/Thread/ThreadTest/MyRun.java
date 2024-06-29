package Thread.ThreadTest;

public class MyRun implements Runnable{
    int ticket = 0;
    @Override
    public void run() {
        while(true){
            synchronized (MyRun.class) {
                if (method()) break;
            }
            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private boolean method() {
        if(ticket<100){
            ticket++;
            System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
        }else return true;
        return false;
    }
}
