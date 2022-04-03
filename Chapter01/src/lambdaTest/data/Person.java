package lambdaTest.data;

/**
 * @author shaoshao
 * @version 1.0
 * @date 2022/4/3 15:46
 */

public class Person {
    public String name;
    public int age;

    public Person() {
        System.out.println("无参构造");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
