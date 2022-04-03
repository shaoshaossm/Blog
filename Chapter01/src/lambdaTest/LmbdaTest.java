package lambdaTest;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 14:15
 */
public class LmbdaTest {
    public static void main(String[] args) {
        // 使用接口实现
        Comparator comparator = new MyComparator();
        // 使用匿名内部类实现
        Comparator comparator1 = new Comparator() {
            @Override
            public int compare(int a, int b) {
                return a - b;
            }
        };
//        使用lambda表达式实现接口
        Comparator comparator2 = (a, b) -> a - b;
    }
}

class MyComparator implements Comparator {
    @Override
    public int compare(int a, int b) {
        return a - b;
    }
}

@FunctionalInterface
interface Comparator {
    int compare(int a, int b);

}
