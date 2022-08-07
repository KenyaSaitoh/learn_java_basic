package pro.kensait.designpattern.lesson06.composite.provider;

import java.util.List;

public interface Node {
    String getName();
    void setParentNode(Node parentNode); // ツリー構築に必要
    void addChildNode(Node childNode); // ツリー構築に必要
    Node getParentNode(); // 下から上にたどる場合に必要
    List<Node> getChildNodeList(); // 上から下に渡り歩く場合に必要
    
    /* XML DOM APIでは、以下のAPIあり
    Component getFirstChild(); // 上から下に渡り歩く場合に必要
    Component getNextSibling(); // 上から下に渡り歩く場合に必要
    そして以下のように渡り歩く
    
    public static void walk(Node parent) {
        for (Node child = parent.getFirstChild();
                  child != null;
                  child = child.getNextSibling()) {
            System.out.println(child.getNodeName() + ":");
            System.out.println("  NodeType: " + child.getNodeType());
            System.out.println("  NodeValue: " + child.getNodeValue());
            walk(child);
        }
    }
    
    ただし、getChildListがあれば事足りる
    */
}