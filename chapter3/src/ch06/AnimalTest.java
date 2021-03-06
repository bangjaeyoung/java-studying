package ch06;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        AnimalTest test = new AnimalTest();

        /*test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);*/

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        for(Animal animal : animalList) {
            animal.move();
        }

        // 다형성 구현 ( 하나의 코드로 여러 결과를 도출 )
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }

    static class Animal {

        public void move() {
            System.out.println("동물이 움직입니다.");
        }

        public void eating() {
            System.out.println("동물이 먹습니다.");    // 공통적으로 쓰일 수 있는 메서드는 상위 클래스에 선언하면 된다.
        }
    }

    static class Eagle extends Animal {
        public void move() {
            System.out.println("독수리가 하늘을 날아 다닙니다.");
        }

        public void flying() {
            System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
        }
    }

    static class Tiger extends Animal {
        public void move() {
            System.out.println("호랑이가 네 발로 뜁니다.");
        }

        public void hunting() {
            System.out.println("호랑이가 사냥을 합니다.");
        }
    }

    static class Human extends Animal {
        public void move() {
            System.out.println("사람이 두 발로 걷습니다.");
        }

        public void readBook() {
            System.out.println("사람이 책을 읽습니다.");
        }
    }
}
