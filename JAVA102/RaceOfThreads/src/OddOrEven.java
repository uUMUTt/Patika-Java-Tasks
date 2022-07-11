
import java.util.ArrayList;
import java.util.List;

public class OddOrEven implements Runnable {

    private final List<Integer> nums;
    private final List<Integer> odds = new ArrayList<>();
    private final List<Integer> evens = new ArrayList<>();

    public OddOrEven(int limit) {

        nums = Main.nums.subList(limit - 2500, limit);
    }

    @Override
    public void run() {
        for (int i : nums) {
            if (i % 2 == 0) {
                Main.evens.add(i);
                evens.add(i);
            } else {
                Main.odds.add(i);
                odds.add(i);
            }
        }
        printList();

    }

    public void printList() {
        System.out.println(odds);
        System.out.println(evens);
    }

}
