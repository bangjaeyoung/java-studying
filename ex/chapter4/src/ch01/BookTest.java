package ch01;

class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author;
    }
}

public class BookTest {

    public static void main(String[] args) {

        Book book = new Book("데미안", "헤르만 헤세");
        System.out.println(book);
        // = System.out.println(book.toString());
        //  toString()은 자동으로 호출된다.

        String string = new String("test");
        System.out.println(string);
        // String 클래스에서 생성된 객체는 toString() 메서드를 재정의 해주든 안해주든 괄호안의 값 그대로 출력해준다.
    }
}
