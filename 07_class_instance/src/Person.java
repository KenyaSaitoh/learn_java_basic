class Person {
    // フィールド
    String name; // ①
    int age; // ②
    // コンストラクタ
    Person() { // ③
    }
    Person(String name, int age) { // ④
        this.name = name;
        this.age = age;
    }
    // メソッド
    void greet() { // ⑤
        String message = "こんにちは！私は" + name +  "、" + age + "歳です。";
        System.out.println(message);
    }
}