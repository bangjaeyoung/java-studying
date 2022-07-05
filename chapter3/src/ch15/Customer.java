package ch15;

public class Customer implements Buy, Sell{
    // 여러 개의 인터페이스들을 구현

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }


//    @Override
//    public void order() {
//        Buy.super.order();
//    }
    // Buy 인터페이스의 default 메서드를 재정의 하겠다.

    //    @Override
//    public void order() {
//        Sell.super.order();
//    }

    // Sell 인터페이스의 default 메서드를 재정의 하겠다.

    @Override
    public void order() {
        System.out.println("customer order");
    }
    // 그냥 직접 재정의 하겠다.

    public void hello() {
        System.out.println("hello");
    }
}
