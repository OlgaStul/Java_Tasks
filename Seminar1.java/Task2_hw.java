// Вывести все простые числа от 1 до 1000

public class Task2_hw {
    public static void main(String[] args) {

        for (int i = 2; i < 50; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break; 
                }
            }
            if (flag) {
                System.out.printf(" " + i);
            }
        }
    }
}