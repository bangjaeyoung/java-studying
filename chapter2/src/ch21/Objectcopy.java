package ch21;

public class Objectcopy {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        System.arraycopy(library, 0, copyLibrary, 0, 5);      // 배열 복사

        System.out.println("=====library=====");
        for(Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("=====copy library=====");     // 배열 복사하면 주소가 같아진다.
        for(Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        System.out.println("=====library=====");
        for(Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("=====copy library=====");     // 객체가 수정되면, 원래 배열과 복사 된 배열 둘 다 같은 객체의 주소를 가지기 때문에, 출력값이 같다.
        for(Book book : copyLibrary) {                    // 얕은 복사
            System.out.println(book);
            book.showInfo();
        }
    }
}