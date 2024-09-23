import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class test {
    public static void main(String[] args) {
        System.out.println(add(1,0.1));
        System.out.println(add(0.2,0.2));
    }
    public static <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}
