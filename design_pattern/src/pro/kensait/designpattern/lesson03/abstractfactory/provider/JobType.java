package pro.kensait.designpattern.lesson03.abstractfactory.provider;

public enum JobType {
    MANAGER("マネージャ"),
    LEADER("リーダー"),
    CHIEF("チーフ"),
    ASSOCIATE("アソシエイト");

    private final String jobType;

    JobType(String jobType) {
        this.jobType = jobType;
    }

    public String toString() {
        return jobType;
    }
}