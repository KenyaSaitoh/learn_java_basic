package pro.kensait.designpattern.lesson10.state.client;

import pro.kensait.designpattern.lesson10.state.provider.Business;

public class Client {
    public static void main(String[] args) {
        Business business = new Business();
        business.createDocument();
        business.applyDocument();
        business.rejectDocument();
        business.applyDocument();
        business.approveDocument();
    }
}
