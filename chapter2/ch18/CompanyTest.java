package chapter2.ch18;

public class CompanyTest {

    public static void main(String[] args) {

        Company company1 = Company.getInstance();       //싱글톤 패턴
        Company company2 = Company.getInstance();       //유일한 객체를 제공할 때 사용한다.
        
        System.out.println(company1);
        System.out.println(company2);

    }
    
}
