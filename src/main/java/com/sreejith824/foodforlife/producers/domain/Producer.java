package com.sreejith824.foodforlife.producers.domain;

public class Producer {
    private String producerShopId;
    private String shopCategory;

    public Producer(String producerShopId) {
        this.producerShopId = producerShopId;
    }

    public String getProducerShopId() {
        return producerShopId;
    }

    public void setProducerShopId(String producerShopId) {
        this.producerShopId = producerShopId;
    }

    public String getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(String shopCategory) {
        this.shopCategory = shopCategory;
    }
}
