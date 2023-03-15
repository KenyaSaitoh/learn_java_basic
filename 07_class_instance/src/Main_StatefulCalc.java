public class Main_StatefulCalc {
    public static void main(String[] args) {
        StatefulCalc calc = new StatefulCalc(30, 10);
        int answer = calc.add();
        System.out.println(answer);
    }
}