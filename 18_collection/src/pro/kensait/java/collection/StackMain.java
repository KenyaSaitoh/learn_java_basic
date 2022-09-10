package pro.kensait.java.collection;

import java.util.Stack;

public class StackMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Stackを生成する。
        Stack stack = new Stack();

        // Stackに要素を格納する。
        System.out.println("##### Stackに要素を格納 #####");
        stack.push("Foo");
        stack.push("Bar");
        stack.push("Baz");
        stack.push("Qux");
        System.out.println(stack);

        // Stackの大きさを表示する。
        System.out.println("##### Stackの大きさ #####");
        System.out.println("Size ---> " + stack.size());

        // Stackから要素を取り出す。
        System.out.println("##### Stackから要素を取り出す #####");
        System.out.println("要素の取り出し ---> " + stack.pop());
        System.out.println("要素の取り出し ---> " + stack.pop());
        System.out.println("次に取り出される要素 ---> " + stack.peek());
        System.out.println(stack);

        // 要素の存在を確認する。
        System.out.println("##### 要素の存在 #####");
        System.out.println("Fooは含まれているか ---> " + stack.contains("Foo"));

        // Stackに要素を追加する。
        System.out.println("##### Stackに要素を追加 #####");
        stack.push("Foo");
        stack.push("Hoge");
        System.out.println(stack);

        // 要素の位置を表示する。
        System.out.println("##### 要素の位置 #####");
        System.out.println("最初のFooの位置 ---> " + stack.indexOf("Foo"));
        System.out.println("最初のFooの位置 ---> " + stack.lastIndexOf("Foo"));

        // Stackから要素を全件削除する。
        System.out.println("##### Stackから要素を全件削除 #####");
        stack.clear();
        System.out.println("Empty? ---> " + stack.isEmpty());
    }
}