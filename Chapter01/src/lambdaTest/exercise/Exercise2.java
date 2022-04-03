package lambdaTest.exercise;

import lambdaTest.data.Person;

import java.util.TreeSet;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 16:35
 */
public class Exercise2 {
    public static void main(String[] args) {
        TreeSet<Person> set = new TreeSet<>((o1, o2) -> {
            if (o1.age >= o2.age) {
                return -1;
            } else {
                return 1;
            } // 不返回0就行 0：去重
        });
        set.add(new Person("xx", 1));
        set.add(new Person("xx4", 4));
        set.add(new Person("xx3", 3));
        set.add(new Person("xx31", 3));
        set.add(new Person("xx2", 2));
        set.add(new Person("xx5", 5));
        System.out.println(set);
    }
}
