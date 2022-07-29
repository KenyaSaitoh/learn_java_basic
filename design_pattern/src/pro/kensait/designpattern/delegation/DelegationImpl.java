package pro.kensait.designpattern.delegation;

public class DelegationImpl {

    private DelegationTarget delegation;

    public DelegationImpl() {
        delegation = new DelegationTarget();
    }

    public void showMessage1() {
        System.out.println("===== DelegationImplがDelegationTargetに委譲している処理 =====");
        delegation.showMessage1(); // DelegationImplに委譲
    }

    public void showMessage2() {
        System.out.println("===== DelegationImplが直接実装している処理 =====");
        System.out.println("This is Message from DelegationImpl");
    }
}