package pro.kensait.java.basic.lesson21_2_2;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        PersonDBSearcher pds = new PersonDBSearcher();
        Optional<Person> opt = pds.find2("Dave");
        if (opt.isEmpty()) {
            //
        }
        Person person = opt.get();
    }
}