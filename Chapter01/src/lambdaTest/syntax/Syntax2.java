package lambdaTest.syntax;

import lambdaTest.interfaces.*;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 14:38
 */
public class Syntax2 {
    public static void main(String[] args) {
        LambdaNoneReturnMultipleParameter lambda1 = (a, b) ->
            System.out.println("hello world");

        LambdaNoneReturnSingleParameter lambda2 = a -> {
            System.out.println("hello world");
        };
        LambdaNoneReturnSingleParameter lambda3 = a -> System.out.println("hello world");
        LambdaSingleReturnNoneParameter lambda4 = () -> 10;
        LambdaSingleReturnSingleParameter lambda6 = a -> a;
        LambdaSingleReturnMultipleParameter lambda5 = (a, b) -> a + b;
        LambdaNoneReturnNoneParameter lambda7 = () -> System.out.println("a");
    }

}
