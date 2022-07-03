package pro.kensait.java.reflection;

import java.util.Date;

public class ReflectionMain8 {

    public static void main(String[] args) {
        Object[] objs = new Object[]{ true, 1, 100.0, "ABC", new Date() };
        for (Object obj : objs) {
            System.out.println(obj.getClass());
            System.out.println(obj.getClass().equals(Boolean.class));
            System.out.println(Boolean.class.isInstance(obj));
            System.out.println("##########");
        }

        Integer i1 = 100;
        Integer i2 = null;
        System.out.println(Integer.class.isInstance(i1));
        System.out.println(Integer.class.isInstance(i2));
        System.out.println(i1.getClass().equals(Integer.class));
        
        // nullに対してgetClass()は呼べないので、null値の元の型を調べる方法は、多分ない。
    }
}
