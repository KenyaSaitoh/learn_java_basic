package pro.kensait.designpattern.lesson09.specification.client;

import java.util.ArrayList;
import java.util.List;

import pro.kensait.designpattern.lesson09.specification.provider.DepartmentAndJobrankSpec;
import pro.kensait.designpattern.lesson09.specification.provider.DepartmentSpec;
import pro.kensait.designpattern.lesson09.specification.provider.JobrankSpec;
import pro.kensait.designpattern.lesson09.specification.provider.User;
import pro.kensait.designpattern.lesson09.specification.provider.UserSpec;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.doBusiness();
    }

    public void doBusiness() {
        // 企画部であること
        UserSpec spec1 = new DepartmentSpec("PLANNIG");
        // 部長であること
        UserSpec spec2 = new JobrankSpec(3);
        // 人事部の主任以上であること
        UserSpec spec3 = new DepartmentAndJobrankSpec("HR", 2);

        List<UserSpec> userSpecList = new ArrayList<>();
        userSpecList.add(spec1);
        userSpecList.add(spec2);
        userSpecList.add(spec3);

        User carol = new User("Carol", "HR", 2); // 人事部の主任
        boolean flag1 = checkPermission(carol, userSpecList);
        System.out.println("Carol => " + flag1);

        User alice = new User("Alice", "SALES", 3); // 営業部の部長
        boolean flag2 = checkPermission(alice, userSpecList);
        System.out.println("Alice => " + flag2);

        User dave = new User("Dave", "SALES", 2); // 営業部の主任
        boolean flag3 = checkPermission(dave, userSpecList);
        System.out.println("Dave => " + flag3);

        User ellen = new User("Ellen", "PLANNIG", 1); // 企画部のアソシエイト
        boolean flag4 = checkPermission(ellen, userSpecList);
        System.out.println("Ellen => " + flag4);
    }

    private boolean checkPermission(User user, List<UserSpec> userSpecList) {
        for (UserSpec spec : userSpecList) {
            if (spec.isSatisfiedBy(user)) {
                return true;
            }
        }
        return false;
    }
}
