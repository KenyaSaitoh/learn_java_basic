package pro.kensait.java.bean;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class Customer {
    private Integer id;
    private String customerName;
    private int age;
    private String job;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public String toString() {
        return "Customer [id=" + id + ", customerName=" + customerName + ", age=" + age
                + ", job=" + job + "]";
    }
}

public class BeansMain1 {
    public static void main(String[] args) throws Exception {
        BeanInfo bi = Introspector.getBeanInfo(Customer.class);
        PropertyDescriptor[] pds = bi.getPropertyDescriptors();

        for (PropertyDescriptor pd : pds) {
            System.out.println("name ---> " + pd.getName());
            System.out.println("type ---> " + pd.getPropertyType().getSimpleName());
            System.out.println("getter ---> " + pd.getReadMethod());
            System.out.println("setter ---> " + pd.getWriteMethod());
            System.out.println("####################");
        }

        //
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("customername", "Foo"); // これはうまくセットできない。
        map.put("age", 35);
        Customer customer = new Customer();

        // PropertyDescriptor駆動
        for (PropertyDescriptor pd : pds) {
            Method setter = pd.getWriteMethod();
            if (setter != null) {
                setter.invoke(customer, map.get(pd.getName()));
            }
        }
        System.out.println(customer);
    }
}
