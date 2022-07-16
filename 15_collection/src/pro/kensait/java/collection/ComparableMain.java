package pro.kensait.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // 2つのComparableTarget1オブジェクトを生成、リストに格納する。
        AbstractComparableTarget target11 = new ComparableTarget1("Bar", 20);
        AbstractComparableTarget target12 = new ComparableTarget1("Foo", 10);
        List list1 = new ArrayList();
        list1.add(target11);
        list1.add(target12);

        // ソートする。
        System.out.println("===== 数値でソート =====");
        System.out.println("[ソート前]");
        showList(list1);
        System.out.println("[ソート後]");
        Collections.sort(list1);
        showList(list1);

        // 2つのComparableTarget2オブジェクトを生成し、リストに格納する。
        AbstractComparableTarget target21 = new ComparableTarget2("Qux", 10);
        AbstractComparableTarget target22 = new ComparableTarget2("Baz", 20);
        List list2 = new ArrayList();
        list2.add(target21);
        list2.add(target22);

        // ソートする。
        System.out.println("===== 文字列でソート =====");
        System.out.println("[ソート前]");
        showList(list2);
        System.out.println("[ソート後]");
        Collections.sort(list2);
        showList(list2);
    }

    public static void showList(List list) {
        Iterator i = list.iterator();
        while (i.hasNext()) {
            AbstractComparableTarget target = (AbstractComparableTarget)i.next();
            String name = target.getName();
            int amount = target.getAmount();
            System.out.println(name + " / " + amount);
        }
    }
}

/* ======================================== */
abstract class AbstractComparableTarget implements Comparable {

    private String name;
    private int amount;

    public AbstractComparableTarget(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return this.name;
    }

    public int getAmount() {
        return this.amount;
    }

    public abstract int compareTo(Object o);
}

/* ======================================== */
class ComparableTarget1 extends AbstractComparableTarget {

    public ComparableTarget1(String name, int amount) {
        super(name, amount);
    }

    public int compareTo(Object o) {
        int comparedAmount = ((ComparableTarget1)o).getAmount();
        return getAmount() - comparedAmount;
    }
}

/* ======================================== */
class ComparableTarget2 extends AbstractComparableTarget {

    public ComparableTarget2(String name, int amount) {
        super(name, amount);
    }

    public int compareTo(Object o) {
        String comparedName = ((ComparableTarget2)o).getName();
        return getName().compareTo(comparedName);
    }
}