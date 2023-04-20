// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

public class array {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1 };
        int count1 = 0;
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1 += 1;
                if (count1 > countMax) {
                    countMax = count1;
                }
            } else {
                count1 = 0;
            }
        }
        System.out.printf("Максимальное количество подряд идущих единиц равно %d\n", countMax);
    }
}
