package pro.kensait.designpattern.lesson06.visitor.provider;

import java.util.ArrayList;
import java.util.List;

import pro.kensait.designpattern.lesson06.visitor.client.visitor.Visitor;

public class Category implements Node {

    private String name;
    private Node parentNode;
    private List<Node> childNodeList = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
        // parentNode.addChildNode(this); 親を追加したときに子を追加する、と親と子で循環呼び出し発生
    }
    
    @Override
    public void addChildNode(Node childNode) {
        childNodeList.add(childNode);
        childNode.setParentNode(this);
    }

    @Override
    public Node getParentNode() {
        return parentNode;
    }

    @Override
    public List<Node> getChildNodeList() {
        return childNodeList;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        // thisの実クラスによってオーバーロードされて分岐する
        // 従って、まったく同じメソッドをProductに実装するにもかかわらず、抽象クラスには書けない
    }
}