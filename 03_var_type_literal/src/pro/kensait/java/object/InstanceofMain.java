package pro.kensait.java.object;

public class InstanceofMain {

    public static void main(String[] args) {
        System.out.println("===== InstanceofTarget1 =====");
        InstanceofTarget1 target1 = new InstanceofTarget1();
        System.out.println(target1 instanceof InstanceofTarget1);
        System.out.println(target1 instanceof InstanceofTarget2);
        System.out.println(target1 instanceof InstanceofTarget3);
        System.out.println(target1 instanceof InstanceofTargetIF);
        System.out.println("===== InstanceofTarget2 =====");
        InstanceofTarget2 target2 = new InstanceofTarget2();
        System.out.println(target2 instanceof InstanceofTarget1);
        System.out.println(target2 instanceof InstanceofTarget2);
        System.out.println(target2 instanceof InstanceofTarget3);
        System.out.println(target2 instanceof InstanceofTargetIF);
        System.out.println("===== InstanceofTarget3 =====");
        InstanceofTarget3 target3 = new InstanceofTarget3();
        System.out.println(target3 instanceof InstanceofTarget1);
        System.out.println(target3 instanceof InstanceofTarget2);
        System.out.println(target3 instanceof InstanceofTarget3);
        System.out.println(target3 instanceof InstanceofTargetIF);
    }
}

/* ======================================== */
class InstanceofTarget1 {
}

/* ======================================== */
class InstanceofTarget2 extends InstanceofTarget1 implements InstanceofTargetIF {
}

/* ======================================== */
class InstanceofTarget3 extends InstanceofTarget2 {
}

/* ======================================== */
interface InstanceofTargetIF {
}