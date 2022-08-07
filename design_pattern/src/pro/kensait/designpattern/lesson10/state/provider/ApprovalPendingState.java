package pro.kensait.designpattern.lesson10.state.provider;

public class ApprovalPendingState implements State {

    @Override
    public boolean canDoAction(String actionName) {
        return false;
    }

    @Override
    public State doAction(String actionName) {
        if (actionName.equals("approve")) {
            System.out.println("[ ApprovalPendingState#doAction ] action = approve, newState = ApprovedState");
            return new ApprovedState();
        } else if (actionName.equals("reject")) {
            System.out.println("[ ApprovalPendingState#doAction ] action = reject, newState =UnderConstractionState");
            return new UnderConstractionState();
        } else {
            throw new IllegalArgumentException();
        }
    }
}