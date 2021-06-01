
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {5,15, 4, 788, 1, -1, -788, 6,5,2, 0};
        Arrays.sort(arr);
        int num, max = 0, min = 0, len = arr.length;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı : ");
        num = inp.nextInt();
        if (arr[0] < num) {

        }
        int minRange = num - arr[0];
        int maxRange = arr[0] - num;
        for (int i = 0, j = len - 1; i < len; i++, j--) {
            if(arr[j] > num){
                max = arr[j];
            }
            if(arr[i] < num){
                min  = arr[i];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
