package com.ATL.salesManagement.model;


import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private int availableQuantity;
    private int price;

    @OneToMany(mappedBy = "product")
    private List<SaleDetail> saleDetailList;


}
