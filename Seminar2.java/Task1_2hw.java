// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task1_2hw {
    public static void main(String[] args) {
        String students = inputString("students.txt");
        System.out.printf("Данная строка: %s\n", students);
        StringBuilder sb = new StringBuilder();
        String studentsFormat = students.substring(1, students.length() - 1);  // убираем {}
        String studentsFormat2 = studentsFormat.replaceAll(":", " = ");  // заменияем : на =
        String[] partsStudentsFormat = studentsFormat2.split(",");  // делим по запятым
        sb.append("SELECT * FROM students Where");
        for (String iterable_element : partsStudentsFormat) {
            if (!iterable_element.contains("null")) {
                sb.append(" AND");
                String newElement = iterable_element.replaceFirst("\"", ""); // убираем кавычки
                String newElement1 = newElement.replaceFirst("\"", "");
                sb.append(newElement1);
            }
        }
        String result = sb.toString().replaceFirst("AND", "");
        System.out.printf("Запрос sql: %s\n", result);
    }

    private static String inputString(String fileName) {
        String string = "";
        try (BufferedReader bd = new BufferedReader(new FileReader(fileName))) {
            string = bd.readLine();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return string;
    }
}
