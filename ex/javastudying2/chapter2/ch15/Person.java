package chapter2.ch15;

import java.util.Scanner;

public class Person {

    String personName;
    int personAge;
    String personSex;
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("성함을 입력해 주세요 : ");
        String personName = scanner.nextLine();

        System.out.println("나이를 입력해 주세요 : ");
        int personAge = scanner.nextInt();
        scanner.nextLine();         //nexInt() 후에 nextLine() 실행 안되기 때문에, 넣어준 문구
        
        System.out.println("성별을 입력해 주세요 : ");
        String personSex = scanner.nextLine();
        
        Person customPerson = new Person(personName, personAge, personSex);
        System.out.println("입력한 사람의 정보입니다.");
        customPerson.showPersonInfo();

        scanner.close();
    }

    public Person(String personName, int personAge, String personSex) {

        this.personName = personName;
        this.personAge = personAge;
        this.personSex = personSex;
    }
    
    public void showPersonInfo() {

        System.out.println("이름은 " + personName + "\n나이는 " + personAge + "\n성별은 " + personSex);
    }
}