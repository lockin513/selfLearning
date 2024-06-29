package Thread.D9ThreadTest.Q4;

public class TestDemo {
    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People();
        People p3 = new People();
        People p4 = new People();
        People p5 = new People();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
    }
}
