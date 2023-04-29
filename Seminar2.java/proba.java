import java.io.FileWriter;
import java.io.IOException;

public class proba {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("proba", false)){
            String text = "Hello";
            writer.write(text);
            writer.append("\n");
            writer.append("I");
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}




/* 
package Java_Seminar2_Classwork;

import java.io.FileWriter;
import java.io.IOException;

public class Task4 {
public static void main(String[] args) {
String text = "TEXT";
int repeat = 100;
String result = strRepeat(text, repeat);
System.out.println(result);
writeToFile(result);
}

private static String strRepeat(String word, int count) {
// StringBuilder result = new StringBuilder();

// result.append(word.repeat(count)); // Эквивалент умножения строк, как для Python.

// result.append(String.valueOf(word).repeat(Math.max(0, count)));
//
// for (int i = 0; i < count; i++) {
// result.append(word);
// }
// return result.toString();
return word.repeat(count);
}

private static void writ
*/
