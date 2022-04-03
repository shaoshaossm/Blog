package lambdaTest.exercise;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 19:55
 */
public class Exercise5 {
    public static void main(String[] args) {
        Thread thread = new Thread(() ->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }

        });

        thread.start();
    }
}
