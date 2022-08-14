package pro.kensait.java.object;

public class CloneMain {

    public static void main(String[] args) {
        CloneablePoint2D point1 = new CloneablePoint2D();
        CloneablePoint2D point2 = point1;
        CloneablePoint2D point3 = (CloneablePoint2D)(point1.clone());
        point1.value = 10;
        point2.value = 20;
        point3.value = 30;
        System.out.println("point1.value ---> " + point1.value);
        System.out.println("point2.value ---> " + point2.value);
        System.out.println("point3.value ---> " + point3.value);
    }
}

/* ======================================== */
class CloneablePoint2D implements Cloneable {

    int value;

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException clse) {
            System.out.println("ERROR OCCURRED!!!");
        }
        return obj;
    }
}