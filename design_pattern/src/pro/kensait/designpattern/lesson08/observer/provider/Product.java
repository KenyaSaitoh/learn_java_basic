package pro.kensait.designpattern.lesson08.observer.provider;

import java.math.BigDecimal;

public class Product {
    private Integer id;
    private String name;
    private String category;
    private String maker;
    private BigDecimal price;
    private Integer deliveryTerm;
    private Integer inventory;
    private Double reviewCount;
    private Double reviewAvg;

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

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Double getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Double reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Double getReviewAvg() {
        return reviewAvg;
    }

    public void setReviewAvg(Double reviewAvg) {
        this.reviewAvg = reviewAvg;
    }
}
