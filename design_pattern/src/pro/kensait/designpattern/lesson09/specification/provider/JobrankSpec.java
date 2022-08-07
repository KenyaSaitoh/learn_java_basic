package pro.kensait.designpattern.lesson09.specification.provider;

public class JobrankSpec implements UserSpec {
    private Integer jobrank;

    public JobrankSpec(Integer jobrank) {
        this.jobrank = jobrank;
    }

    public Integer getJobrank() {
        return jobrank;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        if(jobrank <= user.getJobrank()) {
            return true;
        }
        return false;
    }
}
