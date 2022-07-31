package pro.kensait.designpattern.templatemethod;

import java.math.BigDecimal;

public abstract class DeliveryFeeLogic {
    private int cartType;
    private BigDecimal deliveryFee;
    private BigDecimal deliveryFee;

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}