package generic.ThreeDPrinter1;

public class ThreeDPrinterTest {

    public static void main(String[] args) {

        Powder powder = new Powder();
        ThreeDPrinter3 printer = new ThreeDPrinter3();

        printer.setMaterial(powder);

        Powder p = (Powder)printer.getMaterial();   // Object 타입으로 생성된 경우, 다시 Powder 타입으로 형변환 해주어야함


        Powder powder1 = new Powder();
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();   // 뒤 괄호에는 자료형 안써줌 -> 타입추론

        powderGenericPrinter.setMaterial(powder1);

        Powder po = powderGenericPrinter.getMaterial();     // 제네릭 타입을 이용하면 형변환이 필요없음
        System.out.println(po.toString());
    }
}
