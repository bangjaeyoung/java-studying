package chapter2.ch08;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person(180, 78, "남성", "Tomas", 37);

        System.out.println(person1.showPersonInfo());

        Person person2 = new Person(170, 72, "남성", "Scott", 24);

        System.out.println(person2.showPersonInfo());

    }
}
