package com.kamil.hardwarestore.model;

import javax.persistence.*;

@Entity
public class Producer {

    @Id
    @Column(name = "producer_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int producerId;

    @Column(name = "producer_name")
    private String producerName;

    public Producer() {
    }

    public Producer(String producerName) {
        this.producerName = producerName;
    }

    public int getProducerId() {
        return producerId;
    }

    public String getProducerName() {
        return producerName;
    }
}
