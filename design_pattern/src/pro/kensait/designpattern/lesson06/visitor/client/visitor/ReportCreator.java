package pro.kensait.designpattern.lesson06.visitor.client.visitor;

import pro.kensait.designpattern.lesson06.visitor.provider.Category;
import pro.kensait.designpattern.lesson06.visitor.provider.Node;
import pro.kensait.designpattern.lesson06.visitor.provider.Product;

public class ReportCreator implements Visitor {

    @Override
    public void visit(Category category) {
        int count = 0;
        for (Node child : category.getChildNodeList()) {
            if (child instanceof Product) count++;
        }
        System.out.println("[ " + category.getName() + " ] 商品数: " + count);
    }
    
    @Override
    public void visit(Product product) {
        System.out.println("商品名: " + product.getName() + ", 価格: " +
                product.getPrice());
    }
}
