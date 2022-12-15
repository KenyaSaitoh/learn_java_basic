package pro.kensait.java.basic.lsn_13_1_4.copy;

public class Address {
    private String zipCode;
    private String city;
    private String addressLine;
    public Address(String zipCode, String city, String addressLine) {
        this.zipCode = zipCode;
        this.city = city;
        this.addressLine = addressLine;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddressLine() {
        return addressLine;
    }
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }
    @Override
    public String toString() {
        return "Address [zipCode=" + zipCode + ", city=" + city + ", addressLine="
                + addressLine + "]";
    }
}
