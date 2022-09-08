package pro.kensait.java.relation1;
public class Main {
    public static void main(String[] args) {
        Department sales = new Department(1, "企画部", "東京本社");
        Employee alice = new Employee(1, "Alice", sales, 300000);
        Employee bob = new Employee(2, "Bob", sales, 420000);
        Employee carol = new Employee(3, "Carol", sales, 380000);
        String deptName = alice.getDepartment().getName();
    }
}
