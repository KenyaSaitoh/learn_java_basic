package pro.kensait.java.basic.lsn_10_2_1;

public class Main_2 {
    public static void main(String[] args) {
        Department sales = new Department(1, "企画部", "東京本社");
        Employee alice = new Employee(1, "Alice", sales, 300000);
        Employee bob = new Employee(2, "Bob", sales, 420000);
        Employee carol = new Employee(3, "Carol", sales, 380000);
        Employee[] employees = {alice, bob, carol}; //【1】
        sales.setEmployees(employees); //【2】

        employees = sales.getEmployees();
        for (Employee e : employees) {
            System.out.println(e.getName());
        }
    }
}
