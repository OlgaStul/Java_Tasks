//  Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
// а остальные - равны ему.

// пояснения см. в тетради

import java.lang.reflect.Array;
import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 3, 3, 1 };
        int[] arrRes = new int[arr.length];
        int val = 3;
        int end = arr.length - 1;
        int begin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                arrRes[end--] = arr[i];
                // end--;
            } else {
                arrRes[begin++] = arr[i];
                // begin++;
            }
        }
        System.out.println(Arrays.toString(arrRes));
    }
}