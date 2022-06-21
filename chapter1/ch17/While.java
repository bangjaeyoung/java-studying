package chapter1.ch17;

public class While {

    public static void main(String[] args) {

        int result = 0;
        int num = 0;

        while (num < 10) {
            ++num;
            result += num;
        }
        System.out.println(result);
        System.out.println(num);
    }
    
}
