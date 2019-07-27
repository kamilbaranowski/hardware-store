package com.kamil.hardwarestore.model.entity;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "netto_price")
    private double nettoPrice;

    @Column(name = "quantity")
    private int quantity;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "producer_id", referencedColumnName = "producer_id")
    private Producer producer;


    public Product() {
    }

    public Product(String productName, double nettoPrice, int quantity, Producer producer) {
        this.productName = productName;
        this.nettoPrice = nettoPrice;
        this.quantity = quantity;
        this.producer = producer;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getNettoPrice() {
        return nettoPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Producer getProducer() {
        return producer;
    }
}
