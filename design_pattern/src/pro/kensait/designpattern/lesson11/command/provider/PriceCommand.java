package pro.kensait.designpattern.lesson11.command.provider;

import java.math.BigDecimal;

public class PriceCommand implements Command {
    private Product product;
    private BigDecimal priceUpDown;

    public PriceCommand(Product product, BigDecimal priceUpDown) {
        this.product = product;
        this.priceUpDown = priceUpDown;
    }

    @Override
    public void execute() {
        product.setPrice(product.getPrice().add(priceUpDown));
    }

    @Override
    public void cancel() {
        product.setPrice(product.getPrice().subtract(priceUpDown));
    }
}