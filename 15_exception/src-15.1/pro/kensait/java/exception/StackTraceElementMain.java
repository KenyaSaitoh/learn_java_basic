package pro.kensait.java.exception;

import java.util.List;

public class StackTraceElementMain {

    public static void main(String[] args) {
        try {
            // nullのListを渡してみる
            List list = null;
            new StackTraceTarget().printFood(list);
        } catch (Exception e) {
            System.out.println(e.getClass().getName() + "発生!!!");
            System.out.println("===== StackTrace =====");
            e.printStackTrace();
            System.out.println("===== StackTraceElement =====");
            StackTraceElement[] traces = e.getStackTrace();
            for (int i = 0; i < traces.length; i++) {
                StackTraceElement trace = traces[i];
                System.out.println("File ---> " + trace.getFileName());
                System.out.println("Line ---> " + trace.getLineNumber());
            }
        }
    }
}

/* ======================================== */
class StackTraceTarget {

    public void printFood(List Foods) {
        for (int i = 0; i < Foods.size(); i++) {
            String Food = (String)Foods.get(i);
            System.out.println(Food);
        }
    }
}