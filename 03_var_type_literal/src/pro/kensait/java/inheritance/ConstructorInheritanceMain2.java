package pro.kensait.java.inheritance;

public class ConstructorInheritanceMain2 extends ConstructorSuperClass2 {

    public static void main(String[] args) {
        ConstructorInheritanceMain2 mainClass = new ConstructorInheritanceMain2();
        System.out.println("x ---> " + mainClass.getX());
        System.out.println("y ---> " + mainClass.getY());
    }

    public ConstructorInheritanceMain2() {
        super();
    }
}

/* ======================================== */
class ConstructorSuperClass2 {

    private int x = 5;
    private int y = 3;

    public ConstructorSuperClass2() {
    }

    public ConstructorSuperClass2(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
