package pro.kensait.designpattern.lesson05.aspect;

public class HelloAspectJMain {

    public static void main(String[] params) {
        Person person = new Person("Alice", 35, "female");
        Integer age = person.getAge();
        person.setAge(age + 1);
        person.sayHello();
    }
}