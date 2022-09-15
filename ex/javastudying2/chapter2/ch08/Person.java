package chapter2.ch08;

public class Person {

    public int height;
    public int weight;
    public String sex;
    public String name;
    public int age;

    public Person(int height, int weight, String sex, String name, int age) {
        
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.name = name;
        this.age = age;

    }

    /* 
    
    public void setHeight(String height) {

        this.height = height;

    } 
    
    따로 생성자를 직접 만들어주면, 이러한 메서드를 모르는 사용자도 손쉽게 이 클래스를 사용할 수 있고, 이러한 메서드를 만들지 않아도 된다.
    
    */

    public String showPersonInfo() {

        return "키가 " + height + " 이고 몸무게가 " + weight + " 킬로인 "+ sex + " 이 있습니다. 이름은 " + name + " 이고 나이는 " + age + "세입니다.";

    }
    
}