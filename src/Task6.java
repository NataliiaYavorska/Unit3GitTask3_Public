import java.util.Scanner;

//Дано три цілих числа. Знайдіть максимальне, мінімальне та середнє.
public class Task6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введіть три цілих числа: ");
        System.out.print("Введіть число 1: ");
        int number1 = input.nextInt();

        System.out.print("Введіть число 2: ");
        int number2 = input.nextInt();

        System.out.print("Введіть число 3: ");
        int number3 = input.nextInt();

        int max = Math.max(Math.max(number1, number2), number3);
        int min = Math.min(Math.min(number1, number2), number3);
        int mid = (number1+number2+number3)-(max+min);

        System.out.println("Максимальне число: "+ max);
        System.out.println("Мінімальне число: "+ min);
        System.out.println("Середнє: "+ mid);
    }
}

