package generic.ThreeDPrinter2;

// T extends를 통해서 제네릭 타입에 들어갈 수 있는 타입을 한정시킴
public class GenericPrinter<T extends Material> {

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }
}
