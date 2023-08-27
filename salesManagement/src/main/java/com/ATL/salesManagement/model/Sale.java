package com.ATL.salesManagement.model;

import java.util.Date;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
@Entity
@Table(name="sale")
public class Sale {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private int amount;
    @ManyToOne
    @JoinColumn(name="id_customer")
    private Customer customer;
    @OneToMany(mappedBy = "sale")
    private List<SaleDetail> saleDetailList = new ArrayList<>();

}
