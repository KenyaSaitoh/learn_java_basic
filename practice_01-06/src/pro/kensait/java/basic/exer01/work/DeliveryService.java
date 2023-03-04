package pro.kensait.java.basic.exer01.work;

import pro.kensait.java.cuifw.ConsoleMenu;
import pro.kensait.java.cuifw.ParamInfo;

public class DeliveryService {
    int GENERAL_CUSTOMER = 0;
    int GOLD_CUSTOMER = 1;

    @ConsoleMenu(order = 1, name = "購入金額による送料計算その1")
    public int calcFee1(
            @ParamInfo(order = 1, name = "購入金額") int totalPrice) {
        int deliveryFee;
        if (10000 <= totalPrice) {
            deliveryFee = 0;
        } else {
            deliveryFee = 1000;
        }
        return deliveryFee;
    }

    @ConsoleMenu(order = 2, name = "購入金額による送料計算その2")
    public int calcFee2(
            @ParamInfo(order = 1, name = "購入金額") int totalPrice) {
        int deliveryFee;
        if (10000 <= totalPrice) {
            deliveryFee = 0;
        } else if (3000 <= totalPrice) {
            deliveryFee = 500;
        } else {
            deliveryFee = 1000;
        }
        return deliveryFee;
    }

    @ConsoleMenu(order = 3, name = "購入金額と顧客種別による送料計算その1")
    public int calcFee3(
            @ParamInfo(order = 1, name = "顧客種別 (0:GENERAL, 1:GOLD)") int customerType,
            @ParamInfo(order = 2, name = "購入金額") int totalPrice) {
        int deliveryFee;
        if (customerType == GENERAL_CUSTOMER && totalPrice < 3000) {
            deliveryFee = 1000;
        } else {
            deliveryFee = 0;
        }
        return deliveryFee;
    }

    @ConsoleMenu(order = 4, name = "購入金額と顧客種別による送料計算その2")
    public int calcFee4(
            @ParamInfo(order = 1, name = "顧客種別 (0:GENERAL, 1:GOLD)") int customerType,
            @ParamInfo(order = 2, name = "購入金額") int totalPrice) {
        int deliveryFee;
        if (customerType == GENERAL_CUSTOMER) {
            if (totalPrice < 10000) {
                deliveryFee = 1000;
            } else {
                deliveryFee = 600;
            }
        } else {
            deliveryFee = 0;
        }
        return deliveryFee;
    }
}
