package pro.kensait.designpattern.lesson11.command.provider;

import java.math.BigDecimal;

public class Product {
    private Integer id;
    private String name;
    private String category;
    private String maker;
    private BigDecimal price;
    private Integer deliveryTerm;

    public Product(Integer id, String name, String category, String maker,
            BigDecimal price, Integer deliveryTerm) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.maker = maker;
        this.price = price;
        this.deliveryTerm = deliveryTerm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getDeliveryTerm() {
        return deliveryTerm;
    }

    public void setDeliveryTerm(Integer deliveryTerm) {
        this.deliveryTerm = deliveryTerm;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", category=" + category
                + ", maker=" + maker + ", price=" + price + ", deliveryTerm="
                + deliveryTerm + "]";
    }
}
