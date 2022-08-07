package pro.kensait.designpattern.lesson05.proxy.client;

import pro.kensait.designpattern.lesson05.proxy.provider.OrderService;
import pro.kensait.designpattern.lesson05.proxy.provider.OrderServiceProxy;

public class Client {

    public static void main(String[] args) {
        OrderService orderService = new OrderServiceProxy();
        orderService.placeOrder(3, 5);
        
        /*
         * 課題は2点。
         * プロキシの存在を意識すること。
         * プロキシを個別に作らないといけないこと。
         * DynamicProxyを使うと、一点目は解決するが、二点目は解決しない。
         * CDIを使うと、どっちも解決できる。
         * 
         */
    }
}