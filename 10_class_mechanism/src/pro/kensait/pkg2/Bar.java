package pro.kensait.pkg2;

import pro.kensait.pkg1.Foo;

public class Bar {
    void doSomething() {
        Foo foo = new Foo(10); //【1】OK
        //int val1 = foo.x; //【2】NG
        int val2 = foo.getX(); //【3】OK
        //int val3 = foo.pow(); //【4】NG
    }
}
