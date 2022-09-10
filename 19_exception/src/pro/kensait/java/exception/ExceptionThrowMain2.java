package pro.kensait.java.exception;

public class ExceptionThrowMain2 {

    static int value1;

    public static void main(String[] args) {
        try {
            value1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException nfe) {
        }
        ExceptionThrowMain2 mainClass = new ExceptionThrowMain2();
        mainClass.method(value1);
    }

    public void method(int value1) {
        System.out.println("##### EXClass1 START #####");
        ExceptionThrowTarget1 target1 = new ExceptionThrowTarget1();
        try {
            System.out.println("---> ExceptionThrowTarget1 CALL START");
            target1.method(value1);
            System.out.println("---> ExceptionThrowTarget1 CALL END");
        } catch (Exception e) {
            System.out.println("---> ExceptionThrowTarget1 RETURN ERROR!!!!!");
        }
        System.out.println("##### ExceptionThrowMain2 END #####");
    }
}

/* ======================================== */
class ExceptionThrowTarget1 {

    public void method(int value1) throws Exception {
        System.out.println("     ===== ExceptionThrowTarget1 START #####");
        ExceptionThrowTarget2 target2 = new ExceptionThrowTarget2();
        try {
            System.out.println("     ---> ExceptionThrowTarget2 CALL START");
            target2.method(value1);
            System.out.println("     ---> ExceptionThrowTarget2 CALL END");
        } catch (Exception e) {
            System.out.println("     ---> ExceptionThrowTarget2 RETURN ERROR!!!!!");
            throw e;
        }
        System.out.println("     ===== ExceptionThrowTarget1 END #####");
    }
}

/* ======================================== */
class ExceptionThrowTarget2 {

    public void method(int value1) throws Exception {
        System.out.println("            ===== ExceptionThrowTarget2 START #####");
        try {
            System.out.println("            ---> ExceptionThrowTarget2 EXECUTE START");
            int value2 = 5000;
            int answer = value2 / value1;
            System.out.println("            ---> ExceptionThrowTarget2 EXECUTE END (answer ---> " + answer + ")");
        } catch (Exception e) {
            System.out.println("            ---> ExceptionThrowTarget2 EXECUTE ERROR!!!!!");
            throw e;
        }
        System.out.println("            ===== ExceptionThrowTarget2 END #####");
    }
}