package lambdaTest.syntax;

import lambdaTest.data.Person;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 14:38
 */
public class Syntax4 {
    public static void main(String[] args) {
        PersonCreater personCreater = () -> new Person();
        // 构造方法的引用
        PersonCreater personCreater2 = Person::new; //等价于上面的()->new Person()
        personCreater2.getPerson();

        PersonCreater2 personCreater21 = Person::new;
        personCreater21.getPerson2("xx",1);
    }




}

interface PersonCreater {
    Person getPerson();

}
interface PersonCreater2{
    Person getPerson2(String name,int age);
}

