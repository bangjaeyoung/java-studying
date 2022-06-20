package ch20;

public class TimesTable2 {

    public static void main(String[] args) {
    
        int i = 1;

        System.out.println("구구단");

        while ( i < 10 ) {
            int j = 1;
            while ( j < 10 ) {

                System.out.println(i + " x " + j + " = " + i * j);
                j++;

            }
            i++;
        }
    }
}