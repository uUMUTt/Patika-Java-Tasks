import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] arr;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin elamanları arasında virgül olacak şekilde giriniz: ");
        arr = inp.nextLine().split(",");

        for (int i = 1; i < arr.length; i++) {
            int a = Integer.parseInt(arr[i]);
            int j = i - 1;
            while (j >= 0 && Integer.parseInt(arr[j]) > a) {
                arr[j + 1] = arr[j];
                j = j - 1;
                arr[j + 1] = Integer.toString(a);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
