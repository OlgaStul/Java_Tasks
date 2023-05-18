// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Task5_2_hw {
    public static void main(String[] args) {
        File file = new File("employee.txt");

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8")) {
            BufferedReader br = new BufferedReader(isr);
            String line;
            List<String> list = new ArrayList<String>();

            while ((line = br.readLine()) != null) {
                list.add(line);
            }

            System.out.println(list);

            Map<String, Integer> namesByPopularity = new HashMap<>();
            String[] array = new String[0];
            int number = 1;

            for (String iterable_element : list) {
                array = iterable_element.split(" ");

                for (int i = 0; i < array.length; i++) {

                    if (i % 2 == 0) {
                        System.out.println(array[i]);

                        if (namesByPopularity.containsKey(array[i])) {
                            number = namesByPopularity.get(array[i]) + 1;
                        }

                        namesByPopularity.put(array[i], number);
                        number = 1;
                    }
                }
            }
            System.out.println(namesByPopularity);

            List<Map.Entry<Integer, String>> listSort = new ArrayList(namesByPopularity.entrySet());
            Collections.sort(listSort, Comparator.comparing(Map.Entry::getValue));
            System.out.println(listSort);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

