package pro.kensait.designpattern.lesson04.decorator.client;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import pro.kensait.designpattern.lesson04.decorator.provider.MakerFilter;
import pro.kensait.designpattern.lesson04.decorator.provider.NameReplacer;
import pro.kensait.designpattern.lesson04.decorator.provider.Product;
import pro.kensait.designpattern.lesson04.decorator.provider.ProductList;

public class Client {
    public static void main(String[] args) {
        Product p1 = new Product(1, "NEO-123", "DESKTOP", "BANANA",
                new BigDecimal(130000), 1);
        Product p2 = new Product(2, "NEO-456", "DESKTOP", "BANANA",
                new BigDecimal(90000), 1);
        Product p3 = new Product(3, "NEO-567", "DESKTOP", "PEACH",
                new BigDecimal(120000), 1);
        Product p4 = new Product(4, "SUPER-123", "DESKTOP", "BANANA",
                new BigDecimal(140000), 1);
        List<Product> input = Arrays.asList(p1, p2, p3, p4);

        /*
        ProductList output = new NameReplacer(
                new MakerFilter(productList, "BANANA"),
                "", "");
        */

        ProductList pl2 = new NameReplacer(input, "NEO", "NEONEO");
        ProductList pl1 = new NameReplacer(pl2, "123", "111");
        ProductList pl4 = new NameReplacer(pl1, "-", "");
        ProductList pl3 = new MakerFilter(pl4, "BANANA");
        for (Product product : pl3) {
            System.out.println(product);
        }
        System.out.println(pl3.size());
    }
}
