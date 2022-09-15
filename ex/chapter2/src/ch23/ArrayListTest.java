package ch23;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<>();    // <Book> : 어떤 객체를 넣을 거냐 지정한다.

        library.add(new Book("태백산맥1 ", "조정래"));
        library.add(new Book("태백산맥2 ", "조정래"));
        library.add(new Book("태백산맥3 ", "조정래"));
        library.add(new Book("태백산맥4 ", "조정래"));
        library.add(new Book("태백산맥5 ", "조정래"));

        for(int i = 0; i < library.size(); i++) {
            library.get(i).showInfo();              // library.get() : ArrayList의 메서드 사용한 것이다.
        }
    }
}
