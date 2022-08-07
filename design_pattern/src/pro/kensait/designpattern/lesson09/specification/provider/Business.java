package pro.kensait.designpattern.lesson09.specification.provider;

import java.util.ArrayList;
import java.util.List;

public class Business {

    public void doBusiness() {
        // 企画部であること
        UserSpec spec1 = new DepartmentSpec("PLAN");
        // 部長であること
        UserSpec spec2 = new JobrankSpec(3);
        // 人事部の主任以上であること
        UserSpec spec3 = new DepartmentAndJobrankSpec("HR", 2);

        List<UserSpec> userSpecList = new ArrayList<UserSpec>();
        userSpecList.add(spec1);
        userSpecList.add(spec2);
        userSpecList.add(spec3);

        User carol = new User("HR", 2); // 人事部の主任
        boolean flag1 = checkPermission(carol, userSpecList);
        System.out.println("Carol => " + flag1);

        User alice = new User("SALES", 3); // 営業一部の部長
        boolean flag2 = checkPermission(alice, userSpecList);
        System.out.println("Alice => " + flag2);

        User dave = new User("SALES", 2); // 総務部の課長
        boolean flag3 = checkPermission(dave, userSpecList);
        System.out.println("Dave => " + flag3);
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
