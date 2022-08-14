package pro.kensait.java.inheritance;

public class ConstructorInheritanceMain1 extends ConstructorSuperClass1 {

    private int y;

    public static void main(String[] args) {
        ConstructorInheritanceMain1 mainClass = new ConstructorInheritanceMain1(5, 3);
        System.out.println("x ---> " + mainClass.getX());
        System.out.println("y ---> " + mainClass.y);
    }

    public ConstructorInheritanceMain1(int x, int y) {
        super(x);
        this.y = y;
    }
}

/* ======================================== */
class ConstructorSuperClass1 {

    private int x;

    public ConstructorSuperClass1(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}