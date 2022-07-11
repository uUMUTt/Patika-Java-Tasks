
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final List<Integer> odds = new ArrayList<>();
    public static final List<Integer> evens = new ArrayList<>();
    public static final List<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {

        fillArray();

        Thread t1 = new Thread(new OddOrEven(2500));
        Thread t2 = new Thread(new OddOrEven(5000));
        Thread t3 = new Thread(new OddOrEven(7500));
        Thread t4 = new Thread(new OddOrEven(10000));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

    static void fillArray() {
        for (int i = 1; i <= 10000; i++) {
            nums.add(i);
        }
    }

}
