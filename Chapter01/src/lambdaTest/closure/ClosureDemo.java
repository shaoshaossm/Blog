package lambdaTest.closure;

import java.util.function.Supplier;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 20:20
 */
public class ClosureDemo {
    public static void main(String[] args) {
        /**
         * lambda的闭包会提升包围变量的生命周期
         * 所以局部变量 num在getNumber()方法内被 get()引用 不会在getNumber()方法执行后销毁
         * 这种方法可以在外部获取到某一个方法的局部变量
         */
        Integer integer = getNumber().get();
        System.out.println(integer);
    }
    public static Supplier<Integer> getNumber(){
        int num = 10;
        return () ->{
            return num;
        };
//        return () ->num;
    }
}
