class Person {
    String name;
    int age;
    String nationality;

    Person() {};

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    void increaseAge() {
        age += 1;
    }

    boolean isAdult() {
        return 20 <= age;
    }

    String createGreetingMessage() {
        String message = null;
        if (nationality.equals("JAPAN")) {
            message = "おはよう！私は" + name + "、" + age + "歳です。";
        } else {
            message = "Good Morning! I'm " + name + "," + age + "years old.";
        }
        return message;
    }

    String createGreetingMessage(boolean isMorning) {
        if (isMorning) {
            return createGreetingMessage();
        }
        String message = null;
        if (nationality.equals("JAPAN")) {
            message = "こんにちは！私は" + name + "、" + age + "歳です。";
        } else {
            message = "Good Afternoon! I'm " + name + "," + age + "years old.";
        }
        return message;
    }
}