package chapter2.ch12;

public class Person {

    String name;
    int age;

    public Person() {

        this("no name", 1);   // 다른 생성자를 호출하는 this
        // 이 statement가 가장 먼저 나와야함
    }

    public Person(String name, int age) {

        this.name = name;   // 자기 자신의 address를 나타내는 this
        this.age = age;

    }

    public void showPerson() {
        System.out.println(name + "," + age);
    }

    public Person getPerson() { 
        return this;            // 자기 자신의 주소를 반환할 때 사용할 this
    }
    
    public static void main(String[] args) {

        Person person = new Person();
        person.showPerson();

        System.out.println(person);     // person 인스턴스의 주소 반환

        Person person2 = person.getPerson();        // getPerson 메서드를 이용한 person 인스턴스의 주소 반환
        System.out.println(person2);

    }
}
