package pro.kensait.java.string;

public class Main2 {
    public static void main(String[] args) {
        (new Main2()).process();
    }

    void process() {
        String str = "foo";
        update(str);
        System.out.println(str); // どうなる？
    }

    void update(String str) {
        str = "bar";
    }
}
