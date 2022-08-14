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
        System.out.println("こんにちは！私は" + name + "、" + age + "歳です。");
    }
}