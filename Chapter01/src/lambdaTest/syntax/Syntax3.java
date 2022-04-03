package lambdaTest.syntax;

import lambdaTest.interfaces.LambdaSingleReturnSingleParameter;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 14:38
 */
public class Syntax3 {
    public static void main(String[] args) {

        LambdaSingleReturnSingleParameter lambda1=a->a*2;
        LambdaSingleReturnSingleParameter lambda2=a->a*2;
        //简化
        LambdaSingleReturnSingleParameter lambda3 = a -> change(a);
        //方法引用
        LambdaSingleReturnSingleParameter lambda4 = Syntax3::change;
        System.out.println(lambda4.test(1));
    }

    public static int change(int a) {
        return a * 2;
    }

}
