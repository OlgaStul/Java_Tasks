// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class Task4_1_hw {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(i, random.nextInt(100));
        }

        System.out.println(numbers);

        numbers = overturn(numbers);

        System.out.println(numbers);
    }


    public static LinkedList<Integer> overturn(LinkedList<Integer> numbers) {
        LinkedList<Integer> numbersOverturn = new LinkedList<>();

        for (int i = 0; i < numbers.size(); i++) {   // обходим с начала списка, добавляем на 0 позицию, 
        numbersOverturn.add(0, numbers.get(i));  // каждый раз остальные сдвигаются
        }
        // for (int i = numbers.size() - 1; i >= 0; i--) {  // обходим с коца списка, добавляем друг за другом,
        //     numbersOverturn.add(numbers.get(i));         // получается также обратный порядок
        // }
        
        return numbersOverturn;
    }
}
