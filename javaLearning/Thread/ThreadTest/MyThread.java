package Thread.ThreadTest;

class MyThread extends Thread{
    static int ticket = 0;
    @Override
    public void run() {
        while(true){
            synchronized (MyThread.class){
                if (method()) break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private boolean method() {
        if(ticket < 100){
            ticket++;
            System.out.println(getName()+"正在卖第"+ticket+"张票");
        }else return true;
        return false;
    }
}