// Сравните строки с помощью == и метода equalis() класса Object
// пояснение в тетради, семинар 3 (код не работал, копия от препода, возможно разница кодирок, русские слова перепечатывала, были иероглифы)

public class StringEquality {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        char l = 'l';
        String s4 = "h" + "e" + "l" + "l" + "o";
        // String s4 = "h" + "e" + "l" + l + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

        if (s1 == s2)
            System.out.println("Равны ссылки");
        else
            System.out.println("Не равны ссылки");

        if (s1.equals(s2))
            System.out.println("Равны значения");
        else
            System.out.println("Не равны значения");
    }
}
