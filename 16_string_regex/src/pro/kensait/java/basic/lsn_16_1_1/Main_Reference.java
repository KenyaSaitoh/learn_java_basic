package pro.kensait.java.basic.lsn_16_1_1;

public class Main_Reference {
    public static void main(String[] args) {
        (new Main_Reference()).process();
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