package generic.ThreeDPrinter2;

public class ThreeDPrinterTest {

    public static void main(String[] args) {

        Powder powder1 = new Powder();
        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();   // 뒤 괄호에는 자료형 안써줌 -> 타입추론

        powderGenericPrinter.setMaterial(powder1);

        Powder po = powderGenericPrinter.getMaterial();
        System.out.println(powderGenericPrinter.toString());
    }
}

