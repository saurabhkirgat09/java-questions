interface A {
    void test();
    default void show() {
        System.out.println("A's show method");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B's Show Method");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C's Show Method");
    }
}

class D implements B,C {
    @Override
    public void test() {
        System.out.println("Test");
    }

    @Override
    public void show() {
        System.out.println("D's Show Method");
    }

//    How to override show without giving its own solution soling teh ambiguity
//    @Override
//    public void show() {
//        C.super.show();
//    }

}

public class DiamondProblemSolution {
    public static void main(String[] args) {
        A d = new D();
        System.out.println("Show Impl with Instance of D");
        d.show();
    }
}
