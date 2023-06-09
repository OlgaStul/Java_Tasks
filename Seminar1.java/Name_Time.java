import java.time.LocalTime;
import java.util.Scanner;

// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
// дополнительно -  
//  В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

public class Name_Time {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in, "866");

        System.out.print("Введите имя: ");
        String name;
        name = user_input.next();

        LocalTime myTime = LocalTime.now();
        
        if (myTime.getHour() >= 5 && myTime.getHour() < 12) {
            System.out.printf("Доброе утро, %s!\n", name);
        }
        else if (myTime.getHour() >= 12 && myTime.getHour() < 18) {
            System.out.printf("Добрый день, %s!\n", name);
        }
        else if (myTime.getHour() >= 18 && myTime.getHour() < 23) {
            System.out.printf("Добрый вечер, %s!\n", name);
        } else {
            System.out.printf("Доброй ночи, %s!\n", name);
        }
        
        // System.out.printf("Привет, %s!\n", name);
        user_input.close();
    }
}