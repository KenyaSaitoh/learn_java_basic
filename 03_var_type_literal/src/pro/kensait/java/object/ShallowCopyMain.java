package pro.kensait.java.object;

public class ShallowCopyMain {

    public static void main(String[] args) {
        Line2D line = new Line2D();
        line.startPoint.x = 5.0;
        line.startPoint.y = 10.0;
        line.endPoint.x = 50.0;
        line.endPoint.y = 100.0;
        System.out.println("===== Before Change =====");
        System.out.println("Line1 Start ---> (" + line.startPoint.x + ", " + line.startPoint.y + ")");
        System.out.println("Line1 End ---> (" + line.endPoint.x + ", " + line.endPoint.y + ")");
        Line2D newline = line.copy();
        System.out.println("Line2 Start ---> (" + newline.startPoint.x + ", " + newline.startPoint.y + ")");
        System.out.println("Line2 End ---> (" + newline.endPoint.x + ", " + newline.endPoint.y + ")");
        System.out.println("===== Change Line1 =====");
        line.startPoint.x = 7.0;
        System.out.println("Line1 Start ---> (" + line.startPoint.x + ", " + line.startPoint.y + ")");
        System.out.println("Line2 Start ---> (" + newline.startPoint.x + ", " + newline.startPoint.y + ")");
    }
}

/* ======================================== */
class Line2D {

    public Point2D startPoint = new Point2D();
    public Point2D endPoint = new Point2D();

    public Line2D copy() {
        Line2D line2 = new Line2D();
        line2.startPoint = this.startPoint;
        line2.endPoint = this.endPoint;
        return line2;
    }
}

/* ======================================== */
class Point2D {

    double x;
    double y;
}
