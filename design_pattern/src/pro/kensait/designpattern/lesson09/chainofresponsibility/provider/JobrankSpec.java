package pro.kensait.designpattern.lesson09.chainofresponsibility.provider;

public class JobrankSpec extends UserSpec {
    private Integer jobrank;

    public JobrankSpec(Integer jobrank) {
        this.jobrank = jobrank;
    }

    public Integer getJobrank() {
        return jobrank;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        System.out.println("[ JobrankSpec ]");
        if(jobrank <= user.getJobrank()) {
            return true;
        }
        return false;
    }
}
