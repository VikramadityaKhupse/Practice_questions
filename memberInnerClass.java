class Outer {
    private int outerVar = 10;

    class Inner {
        void display() {
            System.out.println("OuterVar: " + outerVar);
        }
    }
}

public class memberInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display(); // Output: OuterVar: 10
    }
}
