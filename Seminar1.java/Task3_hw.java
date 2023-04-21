import java.util.Scanner;

// Реализовать простой калькулятор

public class Task3_hw {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in, "866");

        double number1 = 0;
        System.out.println("Введите первое число: ");
        if (user_input.hasNextDouble()) {
            number1 = user_input.nextDouble();
        } else {
            System.out.println("Некорректный ввод. Попробуйте еще раз.");
        }

        double number2 = 0;
        System.out.println("Введите второе число: ");
        if (user_input.hasNextDouble()) {
            number2 = user_input.nextDouble();
        } else {
            System.out.println("Некорректный ввод. Попробуйте еще раз.");
        }

        int operation = 0;
        System.out.println(
                "Выберите номер операции над числами из предложенных:\n 1 - сложение (+),\n 2 - вычитание (-),\n 3 - умножение (*),\n 4 - деление (/)\n");
        if (user_input.hasNextInt()) {
            operation = user_input.nextInt();
        } else {
            System.out.println("Некорректный ввод. Попробуйте еще раз.");
        }

        switch (operation) {
            case 1:
                System.out.printf("Ответ: %f + %f = ", number1, number2);
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.printf("Ответ: %f - %f = ", number1, number2);
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.printf("Ответ: %f * %f = ", number1, number2);
                System.out.println(number1 * number2);
                break;
            case 4:
                if (number2 == 0)
                    System.out.println("На ноль делить нельзя!");
                else{
                    double res;
                    res = number1 / number2;
                    System.out.printf("Ответ: %f / %f = ", number1, number2);
                    System.out.println(res);
                }  
                break;
            default:
                break;

        }
    }
}
