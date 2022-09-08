package pro.kensait.java.relation2;
public class Main {
    public static void main(String[] args) {
        Department sales = new Department(1, "企画部", "東京本社");
        Employee alice = new Employee(1, "Alice", sales, 300000);
        Employee bob = new Employee(2, "Bob", sales, 420000);
        Employee carol = new Employee(3, "Carol", sales, 380000);
        Employee[] employees = {alice, bob, carol};
        sales.setEmployees(employees);
        
        employees = sales.getEmployees();
        for (Employee e : employees) {
            System.out.println(e.getName());
        }
    }
    void order(Customer customer, Product product) {
        //....注文処理....
    }
    static class Customer {}
    static class Product {}
}
class Foo {
    void fooMethod() {
        Bar bar = new Bar();
        bar.process(this); // this渡し
    }
}
class Bar {
    void process(Foo foo) {
        //....fooに対する処理....
    }
}
