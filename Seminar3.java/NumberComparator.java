
import java.util.Comparator;

public class NumberComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2)
            return 1; // если здесь изменить на 1, а в else на -1 то отсортирует по убыванию
        else if (o1 == o2)
            return 0;
        else
            return -1;

    }
}