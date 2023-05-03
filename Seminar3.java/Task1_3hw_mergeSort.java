// Реализовать алгоритм сортировки слиянием.

public class Task1_3hw_mergeSort {

    public static void main(String[] args) {
        int[] number = {8, 4, 1, 6, 0, 4, 7, 2};
        mergeSort(number, number.length);
        for (int i = 0; i < number.length; i++)
            System.out.println(number[i]);
    }

    public static void mergeSort(int[] number, int n) {
        if (n < 2)
            return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = number[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = number[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(number, l, r, mid, n - mid);
    }

    public static void merge(int[] number, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {

            if (l[i] <= r[j])
                number[k++] = l[i++];
            else
                number[k++] = r[j++];

        }

        while (i < left)
            number[k++] = l[i++];

        while (j < right)
            number[k++] = r[j++];
    }
}
