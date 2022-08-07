package pro.kensait.designpattern.lesson05.proxy.provider;

public interface OrderService {
    void placeOrder(int customerId, int productId);
}