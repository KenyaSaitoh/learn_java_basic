package pro.kensait.java.basic.lsn_21_1_2;

public class Foo {
    private int x;
    private int y;
    public Foo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Foo [x=" + x + ", y=" + y + "]";
    }
    public static class Bar {
        private int x;
        private int y;
        public Bar(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void doSomething() {
            Foo foo = new Foo(30, 10);
            System.out.println(foo);
        }
        @Override
        public String toString() {
            return "Bar [x=" + x + ", y=" + y + "]";
        }
    }
}