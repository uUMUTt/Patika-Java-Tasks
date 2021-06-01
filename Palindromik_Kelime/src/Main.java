
public class Main {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "babbab";
        System.out.print(str);
        System.out.println(isPalindrome(str) ? " palindromiktir" : " palindromik değildir ");
    }
}
