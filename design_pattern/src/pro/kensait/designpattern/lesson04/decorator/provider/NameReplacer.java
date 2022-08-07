package pro.kensait.designpattern.lesson04.decorator.provider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameReplacer extends ProductList {
    private String before;
    private String after;

    public NameReplacer(List<Product> input, String before, String after) {
        super(input);
        this.before = before;
        this.after = after;
    }

    @Override
    public Iterator<Product> iterator() {
        List<Product> output = new ArrayList<Product>();
        for (Product product : input) {
            String replacedName = product.getName().replace(before, after);
            product.setName(replacedName);
            output.add(product);
        }
        return output.iterator();
        
        /*
         * あくまでもイテレーションの中で文字列を置換して返しているだけであり、
         * リスト本体が書き換わるわけではない
         */
    }
}