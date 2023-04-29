/* Задача 1.
* Дано четное число N (>0) и символы c1 и c2.
* Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2,
* начиная с c1.
*/

// package Java_Seminar2_Classwork;

public class Task1 {
    public static void main(String[] args) {
        int n = 15;
        char c1 = 'a';
        char c2 = '0';

        System.out.println(showStr(n, c1, c2));
    }

    private static String showStr(int count, char c1, char c2) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < count; i++) {
            if (i % 2 == 0) str.append(c1);
            else str.append(c2);
        }
        return str.toString();
    }
}

/*
 * Второй вариант
 * 
 * 
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("num: ");
        int num = iScanner.nextInt();

        System.out.printf("c1: ");
        String c1 = iScanner.next();

        System.out.printf("c2: ");
        String c2 = iScanner.next();

        iScanner.close();

        System.out.println(returnString(num, c1.charAt(0), c2.charAt(0)));


    }

    private static String returnString(int num, char c1, char c2) {
        StringBuilder finalString = new StringBuilder();
        for (int index = 0; index < num/2; index++) {
            finalString.append(c1);
            finalString.append(c2);
        }

        return finalString.toString();
    }
}
 */