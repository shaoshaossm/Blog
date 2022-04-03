package lambdaTest.exercise;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 16:35
 */
public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        list.forEach(System.out::println);
        list.forEach(ele -> {
            if (ele % 2 == 0) {
                System.out.println(ele);
            }
        });

    }
}
