import java.util.StringTokenizer;

public class WhileMain3 {
    public static void main(String[] args) {
        String str = "Foo,Bar,Baz,Qux";
        StringTokenizer st = new StringTokenizer(str, ",");
        while (st.hasMoreTokens()) {
            String name = st.nextToken();
            System.out.println(name);
        }
    }
}
