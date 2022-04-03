package lambdaTest.exercise;

import lambdaTest.data.Person;

import java.util.ArrayList;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 16:35
 */
public class Exercise1 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("xx", 1));
        list.add(new Person("xx4", 4));
        list.add(new Person("xx3", 3));
        list.add(new Person("xx2", 2));
        list.add(new Person("xx5", 5));
        list.sort((o1, o2) ->
                o2.age - o1.age
        );
        System.out.println(list);
    }
}
