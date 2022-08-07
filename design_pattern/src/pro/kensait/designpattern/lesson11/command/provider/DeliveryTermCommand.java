package pro.kensait.designpattern.lesson11.command.provider;

public class DeliveryTermCommand implements Command {
    private Product product;
    private Integer deliveryTermUpDown;
    
    public DeliveryTermCommand(Product product, Integer deliveryTermUpDown) {
        this.product = product;
        this.deliveryTermUpDown = deliveryTermUpDown;
    }

    @Override
    public void execute() {
        product.setDeliveryTerm(product.getDeliveryTerm() + deliveryTermUpDown);
    }

    @Override
    public void cancel() {
        product.setDeliveryTerm(product.getDeliveryTerm() - deliveryTermUpDown);
    }
}