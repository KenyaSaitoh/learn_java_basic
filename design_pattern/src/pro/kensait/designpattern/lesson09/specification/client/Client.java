package pro.kensait.designpattern.lesson09.specification.client;

import pro.kensait.designpattern.lesson09.specification.provider.Business;

public class Client {

    public static void main(String[] args) {
        Business business = new Business();
        business.doBusiness();
    }
}
