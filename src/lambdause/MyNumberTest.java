package lambdause;

@FunctionalInterface
interface MyNumber {

    int getMax(int num1, int num2);
}

public class MyNumberTest {

    public static void main(String[] args) {

        MyNumber myNumber = (x, y) -> x > y ? x : y;
        System.out.println(myNumber.getMax(10, 20));
    }
}
