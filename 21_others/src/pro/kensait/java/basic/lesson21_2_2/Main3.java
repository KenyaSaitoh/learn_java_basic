package pro.kensait.java.basic.lesson21_2_2;

import java.util.Optional;

public class Main3 {
    public static void main(String[] args) {
        PersonDBSearcher pds = new PersonDBSearcher();

        Optional<Person> opt = pds.find2("Dave");

        // 何らかの他のインスタンスを代入する
        Person p1 = opt.orElse(new Person());

        // java.util.NoSuchElementExceptionを発生させる
        Person p2 = opt.orElseThrow();

        // 任意の例外をスローする
        Person p3 = opt.orElseThrow(() -> new RuntimeException("Daveは存在せず"));
    }
}