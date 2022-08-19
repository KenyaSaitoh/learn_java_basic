class Person {
    // フィールド
    String name;
    int age;

    // コンストラクタ
    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // メソッド
    void greet() {
        String message = "こんにちは！私は" + name + "、" + age + "歳です。";
        System.out.println(message);
    }
}