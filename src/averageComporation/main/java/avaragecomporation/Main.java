package averageComporation.main.java.avaragecomporation;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        AverageComporation comparator = new AverageComporation();

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(6, 7, 8, 9, 10);

        System.out.println(comparator.compareLists(list2, list1));
    }
}

