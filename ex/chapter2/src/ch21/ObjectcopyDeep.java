package ch21;

public class ObjectcopyDeep {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        copyLibrary[0] = new Book();                // library 배열과 copyLibrary 배열이 다른 객체의 주소를 가지게 된다.
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for(int i = 0; i < library.length; i++) {                   // 깊은 복사
            copyLibrary[i].setTitle(library[i].getTitle());         // 객체의 주소는 다르고, 객체의 내용만 똑같다.
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }

        System.out.println("=====library=====");
        for(Book book : library) {
            System.out.println(book);
            book.showInfo();
        }
        System.out.println("=====copy library=====");
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
        System.out.println("=====copy library=====");
        for(Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
    }
}