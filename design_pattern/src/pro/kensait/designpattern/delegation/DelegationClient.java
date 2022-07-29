package pro.kensait.designpattern.delegation;

public class DelegationClient {

    public static void main(String[] args) {
        DelegationImpl deligation = new DelegationImpl();
        deligation.showMessage1();
        deligation.showMessage2();
    }
}