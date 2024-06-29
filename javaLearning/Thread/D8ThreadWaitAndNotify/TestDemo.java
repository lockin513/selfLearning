package Thread.D8ThreadWaitAndNotify;

public class TestDemo {
    public static void main(String[] args) {
        Desk desk = new Desk();
        Cook cook = new Cook();
        Foodie foodie = new Foodie();
        cook.start();
        foodie.start();
    }
}
