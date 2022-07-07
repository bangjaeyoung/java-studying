package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

        Class c1 = Class.forName("ch04.Person");
        // Person 이라는 클래스를 불러온다.

        Person person = (Person)c1.newInstance();
        // Person 타입의 새로운 객체를 만든다.

        person.setName("Lee");
        System.out.println(person);

        Class c2 = Class.forName("ch04.Person");
        // person이라는 인스턴스가 이미 있는 상태에서, Person 클래스를 불러오는 또 다른 방법
        Person person1 = (Person)c2.newInstance();
        System.out.println(person1);

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"김유신"};
        Person personLee = (Person)cons.newInstance(initargs);
        System.out.println(personLee);
        //Person Kim2 = new Person("김유신");
        //위의 person 클래스를 가져와서 Kim 인스턴스를 만드는 과정이 이 한 줄이다.
    }
}