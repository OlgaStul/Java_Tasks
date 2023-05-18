// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь 
// несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task5_1_Tel_hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "866");
        Map<String, List<String>> telephoneDirectory = new HashMap<>();
        String[] inputArr = new String[2];

        while (true) {
            System.out.println("Введите ФИО и номер телефона через запятую, для окончания ввода нажмите Enter: ");
            System.out.println("Чтобы вывести телефонный справочник, введите 1: ");
            String input = scanner.nextLine();

            if (input.equals("")) {
                System.out.println("Пустой ввод");
                break;
            } else {
                if (input.contains(", ")) {
                    inputArr = input.split(", ");
                    List<String> listNumbers = new ArrayList<>();
                    listNumbers.add(inputArr[1]);

                    if (telephoneDirectory.containsKey(inputArr[0])) {
                        List<String> listNumbers2 = new ArrayList<>();
                        listNumbers2 = telephoneDirectory.get(inputArr[0]);
                        for (String iterable_element : listNumbers2) {
                            listNumbers.add(iterable_element);
                        }
                        telephoneDirectory.put(inputArr[0], listNumbers);

                    } else {
                        telephoneDirectory.put(inputArr[0], listNumbers);
                    }
                }

                if (input.equals("1")) {
                    if (!telephoneDirectory.isEmpty())
                        System.out.println(telephoneDirectory);
                        
                    else
                        System.out.println("Телефонный справочник пуст");
                    break;
                }
            }
        }
        scanner.close();
    }
}
