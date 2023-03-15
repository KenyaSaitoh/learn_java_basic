public class Main_CalcForVariableParams {
    public static void main(String[] args) {
        CalcForVariableParams calc = new CalcForVariableParams();
        int answer = calc.add(15, 5, 30, 10); // いくつでも指定可能
        System.out.println(answer);
    }
}