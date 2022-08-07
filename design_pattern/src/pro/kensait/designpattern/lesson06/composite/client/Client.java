package pro.kensait.designpattern.lesson06.composite.client;

import java.math.BigDecimal;

import pro.kensait.designpattern.lesson06.composite.provider.Category;
import pro.kensait.designpattern.lesson06.composite.provider.Node;
import pro.kensait.designpattern.lesson06.composite.provider.Product;

public class Client {

    public static void main(String[] args) {

        //
        Category root = new Category("Root");
        Category pc = new Category("PC");
        Category desktop = new Category("Desktop");
        Category laptop = new Category("Laptop");
        Category display = new Category("Display");

        Product p1 = new Product("H-123", new BigDecimal(120000));
        Product p2 = new Product("F-123", new BigDecimal(150000));
        Product p3 = new Product("P-123", new BigDecimal(110000));
        Product p4 = new Product("L-123", new BigDecimal(180000));
        Product p5 = new Product("A-123", new BigDecimal(30000));
        Product p6 = new Product("I-123", new BigDecimal(50000));

        // 親に子を登録して構築
        root.addChildNode(pc);
        root.addChildNode(display);
        pc.addChildNode(desktop);
        pc.addChildNode(laptop);
        desktop.addChildNode(p1);
        desktop.addChildNode(p2);
        laptop.addChildNode(p3);
        laptop.addChildNode(p4);
        display.addChildNode(p5);
        display.addChildNode(p6);

        // 子に親を登録して構築（循環呼び出し回避のために今回は採用せず）
        /*
        pc.setParentNode(root);
        desktop.setParentNode(pc);
        laptop.setParentNode(pc);
        display.setParentNode(root);
        p1.setParentNode(desktop);
        p2.setParentNode(desktop);
        p3.setParentNode(laptop);
        p4.setParentNode(laptop);
        p5.setParentNode(display);
        p6.setParentNode(display);
        */

        walk(root);
    }

    private static void walk(Node parent) {
        for (Node node : parent.getChildNodeList()) {
            // CategoryとProductは同じように扱うのが基本だが、価格の表示はProduct固有なので、キャストは不可避

            if (node instanceof Product p) {
                // Productの場合のレポート機能
                System.out.println("商品名: " + node.getName() + ", 価格: " + p.getPrice());

            } else {
                // Categoryの場合のレポート機能
                int count = 0;
                for (Node child : node.getChildNodeList()) {
                    if (child instanceof Product) count++;
                }
                System.out.println("[ " + node.getName() + " ] 商品数: " + count);
            }
            walk(node);
        }
    }
}