package lambdaTest.closure;

import java.util.function.Consumer;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 20:20
 */
public class ClosureDemo2 {
    public static void main(String[] args) {
        int a = 10;
        Consumer<Integer> c = ele -> {
            System.out.println(a+1);
            //System.out.println(ele);
            //System.out.println(a++); 会报错
            //在lambda中引用局部变量 这个变量必须是一个常量
        };
        //a++; 这样也会导致内部报错
        //如果在内部已经引用局部变量 参数传递后 打印的还是 10
        c.accept(a);
        c.accept(1);

    }
}
