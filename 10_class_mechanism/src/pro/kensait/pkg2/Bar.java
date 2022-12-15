package pro.kensait.pkg2;

import pro.kensait.pkg1.Foo;

public class Bar {
    void doSomething() {
        Foo foo = new Foo(10); //【1】
        //int val1 = foo.x; //【2】
        int val2 = foo.getX(); //【3】
        //int val3 = foo.pow(); //【4】
    }
}
