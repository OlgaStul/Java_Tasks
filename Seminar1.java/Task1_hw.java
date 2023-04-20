import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task1_hw {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in, "866");
        System.out.println("Введите число: ");
        int number = 0;
        if (user_input.hasNextInt()) {
            number = user_input.nextInt();
        } else {
            System.out.println("Вы ввели не число. Попробуйте еще раз.");
        }
        int sum = 0;
        int multi = 1;
        for (int i = number; i > 0; i--) {
            sum += i;
            multi *= i;
        }
        System.out.printf("Треугольное число равно %d, факториал равен %d", sum, multi);
    }
}
