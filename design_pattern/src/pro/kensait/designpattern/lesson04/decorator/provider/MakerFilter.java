package pro.kensait.designpattern.lesson04.decorator.provider;

import java.util.ArrayList;
import java.util.List;

public class MakerFilter extends ProductList {

    public MakerFilter(List<Product> input, String condition) {
        List<Product> output = new ArrayList<Product>();
        for (Product product : input) {
            if (product.getMaker().equals(condition)) {
                output.add(product);
            }
        }
        super.input = output;
    }
    /*
     * コンストラクタの中で絞り込みを行い、リスト本体を書き換える。
     * リスト本体は書き換えずに、イテレータの中で絞り込むことはできるが、
     * そうすると、sizeメソッドなど、すべからくメソッドをオーバーライドする必要が
     * 生じてしまう。
     */
}