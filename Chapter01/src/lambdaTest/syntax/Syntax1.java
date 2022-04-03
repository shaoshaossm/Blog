package lambdaTest.syntax;

import lambdaTest.interfaces.*;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 14:38
 */
public class Syntax1 {
    public static void main(String[] args) {
        // () : 描述参数列表
        // () : 描述方法体
        // () : lambda运算符，读作goes to

        // 无返回，无参
        LambdaNoneReturnNoneParameter lambda1 = () -> {
            System.out.println("hello World");
        };
        lambda1.test();

        // 无返回，单个参数
        LambdaNoneReturnSingleParameter lambda2 = (int a) -> {
            System.out.println(a);
        };
        lambda2.test(10);

        // 无返回，多个参数
        LambdaNoneReturnMultipleParameter lambda3 = (int a, int b) -> {
            System.out.println(a + b);
        };
        lambda2.test(10 + 20);

        // 有返回，无参数
        LambdaSingleReturnNoneParameter lambda4 = () -> {
            System.out.println("lambda4");
            return 10;
        };
        int test4 = lambda4.test();
        System.out.println(test4);
        // 有返回，单参数
        LambdaSingleReturnSingleParameter lambda5 = (int a) -> {
            System.out.println("lambda5");
            return a*2;
        };
        int test5 = lambda5.test(10);
        System.out.println(test5);
        // 有返回，多个参数
        LambdaSingleReturnMultipleParameter lambda6 = (int a,int b) -> {
            System.out.println("lambda6");
            return a+b;
        };
        int test6 = lambda6.test(10,20);
        System.out.println(test6);
    }

}
