package pro.kensait.designpattern.lesson11.command.client;

import java.math.BigDecimal;
import java.util.List;

import pro.kensait.designpattern.lesson11.command.provider.CommandHistory;
import pro.kensait.designpattern.lesson11.command.provider.PriceCommand;
import pro.kensait.designpattern.lesson11.command.provider.Product;
import pro.kensait.designpattern.lesson11.command.provider.ProductUtil;

public class Client {

    public static void main(String[] args) {
        List<Product> productList = ProductUtil.getProductList();
        Product product = productList.get(0);
        CommandHistory history = new CommandHistory();

        PriceCommand c1 = new PriceCommand(product, new BigDecimal(10));
        c1.execute(); // 13010
        history.addCommand(c1);
        PriceCommand c2 = new PriceCommand(product, new BigDecimal(20));
        c2.execute(); // 13030
        history.addCommand(c2);
        PriceCommand c3 = new PriceCommand(product, new BigDecimal(30));
        c3.execute(); // 13060
        history.addCommand(c3);

        System.out.println(product);

        history.redo(); // 13090
        System.out.println(product);

        history.back(); // 13060
        System.out.println(product);
        
        history.back(); // 13030
        System.out.println(product);

        history.back(); // 13010
        System.out.println(product);

        history.forward();  // 13030
        System.out.println(product);

        history.forward();  // 13060
        System.out.println(product);
    }
}
