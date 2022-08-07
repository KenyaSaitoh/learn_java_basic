package pro.kensait.designpattern.lesson05.proxy.provider;

public class OrderServiceImpl implements OrderService {

    @Override
    public void placeOrder(int customerId, int productId) {
        // 指定されて顧客に対して商品の注文取引を実行する
        System.out.println("[ OrderServiceImpl#placeOrder ]");
    }
}