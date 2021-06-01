import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int operator;
    int number1, number2 ,result;
    Scanner input = new Scanner(System.in);
    System.out.println("Bir Operator Seciniz: 1 = '+',2 = '-',3 = '*', 4 = '/'");
    operator = input.nextInt();

    System.out.println("İlk Sayi: ");
    number1 = input.nextInt();
    System.out.println("İkinci sayi");
    number2 = input.nextInt();

    switch (operator) {
      case 1:
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;
      case 2:
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;
      case 3:
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;
      case 4:
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
      default:
        System.out.println("Yanlış Değer!");
        break;
    }
    input.close();
  }
}