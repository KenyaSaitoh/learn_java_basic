package pro.kensait.java.basic.lsn_21_2_2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("***** snippet_1 *****");
            PersonDBSearcher pds = new PersonDBSearcher();
            Optional<Person> opt = pds.find2("Dave"); //【1】"Alice" or "Dave"
            if (opt.isEmpty()) { //【2】
                //【3】Optionalが空だった場合の処理
                System.out.println("empty");
            } else {
                Person person = opt.get(); //【4】
                System.out.println(person);
            }
        }
        {
            System.out.println("***** snippet_2 *****");
            PersonDBSearcher pds = new PersonDBSearcher();
            Optional<Person> opt = pds.find2("Dave");
            //【1】空の場合、何らかの代わりのインスタンスを代入する
            Person p1 = opt.orElse(new Person());
            //【2】空の場合、例外（java.util.NoSuchElementException）を発生させる
            // Person p2 = opt.orElseThrow();
            //【3】空の場合、例外（任意の例外）を発生させる
            // Person p3 = opt.orElseThrow(() -> new RuntimeException("Daveは存在せず"));
            System.out.println(p1);
            //System.out.println(p2);
            //System.out.println(p3);
        }
    }
}