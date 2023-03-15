class Person {
    // フィールド
    String name; // 名前
    int age; // 年齢
    // コンストラクタ
    Person() {
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // メソッド
    void sayHello() {
        String message = "こんにちは！私は" + name +  "、" + age + "歳です。";
        System.out.println(message);
    }
}