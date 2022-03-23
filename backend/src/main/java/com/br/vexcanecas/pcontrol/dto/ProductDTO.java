package com.br.vexcanecas.pcontrol.dto;

import com.br.vexcanecas.pcontrol.entities.Product;

import java.io.Serializable;

public class ProductDTO implements Serializable {

    private Long id;
    private String name;
    private String description;
    private Integer quantity;
    private String imgUrl;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductDTO(Long id, String name, String description, Integer quantity, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.description = product.getDescription();
        this.quantity = product.getQuantity();
        this.imgUrl = product.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
