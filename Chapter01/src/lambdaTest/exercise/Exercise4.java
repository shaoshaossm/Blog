package lambdaTest.exercise;

import lambdaTest.data.Person;

import java.util.ArrayList;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 16:35
 */
public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("xx", 1));
        list.add(new Person("xx4", 4));
        list.add(new Person("xx3", 3));
        list.add(new Person("xx2", 2));
        list.add(new Person("xx5", 5));
        // 删除集合中年龄大于2的人
//        ListIterator<Person> it = list.listIterator();
//        while (it.hasNext()) {
//            if (it.next().age > 2) {
//                it.remove();
//            }
//        }

        /**
         * lambda实现
         * 逻辑
         * 将集合中的每一个元素都带入到接口Predicate的test方法中，
         * 如果返回值是true，则删除这个元素
         */
        list.removeIf(ele -> ele.age > 2);
        System.out.println(list);
    }
}
