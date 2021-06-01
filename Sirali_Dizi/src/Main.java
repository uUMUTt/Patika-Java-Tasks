
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int [] arr;int len;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizi Boyutu : ");
        len = inp.nextInt();
        arr = new int[len];
        for(int i = 0; i < len; i++){
            System.out.print(i+1 + ".eleman : ");
            arr[i] = inp.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sıralı Dizi : " + Arrays.toString(arr));
    }
}
