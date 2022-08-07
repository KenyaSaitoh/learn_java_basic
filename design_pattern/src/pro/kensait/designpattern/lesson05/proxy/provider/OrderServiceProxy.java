package pro.kensait.designpattern.lesson05.proxy.provider;

public class OrderServiceProxy implements OrderService {

    private OrderService orderService;

    @Override
    public void placeOrder(int customerId, int productId) {
        System.out.println("[ OrderServiceProxy#placeOrder ] Start");
        orderService = new OrderServiceImpl();
        orderService.placeOrder(customerId, productId);
        System.out.println("[ OrderServiceProxy#placeOrder ] End");
    }
}