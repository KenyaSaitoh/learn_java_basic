package pro.kensait.java.basic;

public class OperationMain {

    public static void main(String[] args) {
        int listSize = 20;
        Integer maxParallelCount = 10;
        Integer splitedListUnit = 8;

        Integer parallelCount = Double.valueOf(
                Math.ceil(listSize / splitedListUnit.doubleValue())).intValue();
        if (maxParallelCount.doubleValue() < parallelCount) {
            parallelCount = maxParallelCount;
        }

        int splitedListCount = Double.valueOf(
                Math.ceil(listSize / parallelCount.doubleValue())).intValue();

        System.out.println("parallelCount ---> " + parallelCount);
        System.out.println("splitedListCount ---> " + splitedListCount);

        int a = 11;
        double b = 0.3;
        int c = 3;
        System.out.println(c <= (a * b));
    }
}