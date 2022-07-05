package ch15;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf() {
        shelf = new ArrayList<>();
        // 생성자를 호출할 때, 멤버 변수를 초기화한다는 뜻이다.
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
