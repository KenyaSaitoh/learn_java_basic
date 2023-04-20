package pro.kensait.pkg1;

import pro.kensait.pkg2.Baz; //【1】

class Foo {
    void doSomething() {
        Baz baz = new Baz(); //【2】
        baz.doSomething();
    }
}