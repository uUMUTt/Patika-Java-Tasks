
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20, 10, 4, 4, 10, 6, 6, 20, 20, 5, 5, 20, 40, 40, 40};
        int cntr = 0, temp, len = arr.length, i = 1;
        Arrays.sort(arr);
        temp = arr[0];
        while (i < len) {
            cntr++;
            if (arr[i] != temp) {
                System.out.println(temp + " sayısı " + cntr + " kere tekrar edildi.");
                cntr = 0;
                temp = arr[i];
            }
            i++;
        }
        cntr++;
        System.out.println(temp + " sayısı " + cntr + " kere tekrar edildi.");

    }
}
