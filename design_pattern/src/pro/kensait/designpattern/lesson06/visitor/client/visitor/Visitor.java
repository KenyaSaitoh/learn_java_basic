package pro.kensait.designpattern.lesson06.visitor.client.visitor;

import pro.kensait.designpattern.lesson06.visitor.provider.Category;
import pro.kensait.designpattern.lesson06.visitor.provider.Product;

public interface Visitor {
    void visit(Category Category);
    void visit(Product product);
}