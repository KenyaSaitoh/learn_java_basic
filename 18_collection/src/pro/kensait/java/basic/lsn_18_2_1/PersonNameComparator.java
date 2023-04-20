package pro.kensait.java.basic.lsn_18_2_1;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> { //【1】
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getGender().equals("male")) { // 男性の場合
            if (p2.getGender().equals("female")) return -1; //【2】
            return p1.getName().compareTo(p2.getName()); //【3】
        } else { // 女性の場合
            if (p2.getGender().equals("male")) return 1; //【4】
            return p1.getName().compareTo(p2.getName()); //【5】
        }
    }
}
