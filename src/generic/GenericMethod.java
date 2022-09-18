package generic;

// 제네릭 메서드란?
// 1. 자료형 매개변수를 메서드의 매개변수나 반환 값으로 가지는 메서드
// 2. 제네릭 클래스가 아니여도, 내부에 제네릭 메서드 구현 가능
// 3. 자료형 매개변수가 하나 이상일 수도 있음
public class GenericMethod {

    public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {

        double left = ((Number) p1.getX()).doubleValue();
        double right = ((Number) p2.getX()).doubleValue();
        double top = ((Number) p1.getY()).doubleValue();
        double bottom = ((Number) p2.getY()).doubleValue();

        double width = right - left;
        double height = bottom - top;

        return width * height;
    }

    public static void main(String[] args) {

        Point<Integer, Double> p1 = new Point<>(0, 0.0);
        Point<Integer, Double> p2 = new Point<>(10, 10.0);

        double size = GenericMethod.<Integer, Double>makeRectangle(p1, p2);
        System.out.println(size);
    }
}

class Point<T, V> {

    T x;
    V y;

    Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}