package pro.kensait.designpattern.lesson09.chainofresponsibility.provider;

public abstract class UserSpec {
    protected UserSpec next;

    public UserSpec setNext(UserSpec next) {
        this.next = next;
        return next; // これが最大のポイントだ！ thisではなくnextを返す！
    }

    public UserSpec getNext() {
        return next;
    }

    public boolean resolve(User user) {
        if (isSatisfiedBy(user)) {
            return true;
        } else {
            if (next != null) {
                return next.resolve(user); // returnを忘れないこと！
            }
        }
        return false;
    }

    public abstract boolean isSatisfiedBy(User user);
}
