class Person {
    // フィールド
    String name; //【1】名前
    int age; //【2】年齢

    // コンストラクタ
    Person() { //【3】
    }
    Person(String name, int age) { //【4】
        this.name = name;
        this.age = age;
    }

    // メソッド
    void sayHello() { //【5】
        String message = "こんにちは！私は" + name +  "、" + age + "歳です。";
        System.out.println(message);
    }
}