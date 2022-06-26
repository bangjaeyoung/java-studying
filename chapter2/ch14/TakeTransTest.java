package chapter2.ch14;

public class TakeTransTest {

    public static void main (String[] args) {

        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);
        
        Bus bus100 = new Bus(100);

        Subway greenColorSubway = new Subway("Green");

        studentJames.takeBus(bus100);

        studentTomas.takeSubway(greenColorSubway);

        System.out.println(studentJames.showTheRestOfMoney());
        System.out.println(studentTomas.showTheRestOfMoney());

        bus100.showPresentSituationOfBus();

        greenColorSubway.showPresentSituationOfSubway();
    }
}
