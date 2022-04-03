package lambdaTest.functional;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 20:05
 */
public class FunctionalInterTest {
    public static void main(String[] args) {


        // Predicate<T>              ：     参数是T 返回值boolean
        // 在后续如果一个接口需要指定类型的参数，返回boolean时可以指向 Predicate
        //          IntPredicate            int -> boolean
        //          LongPredicate           long -> boolean
        //          DoublePredicate         double -> boolean

        // Consumer<T>               :      参数是T 无返回值(void)
        //          IntConsumer             int ->void
        //          LongConsumer            long ->void
        //          DoubleConsumer          double ->void

        // Function<T,R>             :      参数类型T  返回值R
        //          IntFunction<R>          int -> R
        //          LongFunction<R>         long -> R
        //          DoubleFunction<R>       double -> R
        //          IntToLongFunction       int -> long
        //          IntToDoubleFunction     int -> double
        //          LongToIntFunction       long -> int
        //          LongToDoubleFunction    long -> double
        //          DoubleToLongFunction    double -> long
        //          DoubleToIntFunction     double -> int

        // Supplier<T> : 参数 无 返回值T
        // UnaryOperator<T> :参数T 返回值 T
        // BiFunction<T,U,R> : 参数 T、U 返回值 R
        // BinaryOperator<T> ：参数 T、T 返回值 T
        // BiPredicate<T,U> :  参数T、U  返回值 boolean
        // BiConsumer<T,U> :    参数T、U 无返回值

        /**
         * 常用的 函数式接口
         * Predicate<T>、Consumer<T>、Function<T,R>、Supplier<T>
         */

    }
}
