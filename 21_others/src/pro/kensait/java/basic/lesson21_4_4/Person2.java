package pro.kensait.java.basic.lesson21_4_4;

public record Person2(String name, int age, String gender) {
    public Person2 {
        if (name == null) throw new IllegalArgumentException("name is null");
        if (age < 0) throw new IllegalArgumentException("age is under 0");
    }

    public void sayHello() {
        String message = "こんにちは！私は" + name + "、" + age + "歳です。";
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "[ name => " + name + ", age => " + age + "]";
    }
}