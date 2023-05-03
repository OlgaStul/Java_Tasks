// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее 
// арифметичское этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task3_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            numbers.add(i, random.nextInt(10));
        }

        double avg = getAverage(numbers);
         
        System.out.println(numbers);
        System.out.printf("Максимум: %d\n", Collections.max(numbers));
        System.out.printf("Минимум: %d\n", Collections.min(numbers));
        System.out.printf("Среднее: %.1f\n", avg);
    }

    private static double getAverage(List<Integer> list) {
        IntSummaryStatistics stats = list.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));
        return stats.getAverage();
    }

}
