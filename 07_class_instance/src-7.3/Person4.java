class Person4 {
    String name;
    int age;
    String nationality;
    String email;

    Person4() {};

    Person4(String name) {
        this.name = name;
    }

    Person4(String name, int age, String nationality, String email) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.email = email;
    }

    // 副作用
    void increaseAge() {
        age += 1;
    }

    // boolean型を返す
    boolean isAdult() {
        return 20 <= age;
    }

    String createGreetMessage(String language) {
        String message = null;
        if (language.equals("JAPAN")) {
            message = "おはよう！私は" + name + "、" + age + "歳です。";
        } else {
            message = "Good Morning! I'm " + name + "," + age + "years old.";
        }
        return message;
    }

    String createVariousGreetMessage(String language, boolean isMorning) {
        String message = null;
        if (isMorning) {
            if (language.equals("JAPAN")) {
                message = "おはよう！私は" + name + "、" + age + "歳です。";
            } else {
                message = "Good Morning! I'm " + name + "," + age + "years old.";
            }
        } else {
            if (language.equals("JAPAN")) {
                message = "こんにちは！私は" + name + "、" + age + "歳です。";
            } else {
                message = "Good Afternoon! I'm " + name + "," + age + "years old.";
            }
        }
        return message;
    }

    // メソッド間呼び出し
    String createVariousGreetMessage2(String language, boolean isMorning) {
        if (isMorning) {
            return createGreetMessage(language); // returnに直接メソッド呼び出しを書く
        }
        String message = null;
        if (language.equals("JAPAN")) {
            message = "こんにちは！私は" + name + "、" + age + "歳です。";
        } else {
            message = "Good Afternoon! I'm " + name + "," + age + "years old.";
        }
        return message;
    }
}