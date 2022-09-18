package generic.ThreeDPrinter1;

// 제네릭 타입의 프린터 클래스
public class GenericPrinter<T> {

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
}
