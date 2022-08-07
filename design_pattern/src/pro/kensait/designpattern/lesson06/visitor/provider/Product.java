package pro.kensait.designpattern.lesson06.visitor.provider;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import pro.kensait.designpattern.lesson06.visitor.client.visitor.Visitor;

public class Product implements Node {

    private String name;
    private BigDecimal price;
    private Node parentNode;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
        //parentNode.addChildNode(this);
    }
    
    @Override
    public void addChildNode(Node childNode) {
        throw new RuntimeException();
    }

    @Override
    public Node getParentNode() {
        return parentNode;
    }

    @Override
    public List<Node> getChildNodeList() {
        return new ArrayList<>(); // null値ではなく、イテレータのために空のリストを返す
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}