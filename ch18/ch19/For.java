package ch18.ch19;

public class For {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);

        int summ = 0;
        int add = 0;

        while (add < 11) {
            summ += add;
            add++;
        }
        System.out.println(summ);
    }
    
}
