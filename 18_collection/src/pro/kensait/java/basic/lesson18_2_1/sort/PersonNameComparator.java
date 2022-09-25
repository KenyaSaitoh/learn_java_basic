package pro.kensait.java.basic.lesson18_2_1.sort;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getGender().equals("male")) { // 男性の場合
            if (p2.getGender().equals("female")) return -1;
            return p1.getName().compareTo(p2.getName());
        } else { // 女性の場合
            if (p2.getGender().equals("male")) return 1;
            return p1.getName().compareTo(p2.getName());
        }
    }
}
