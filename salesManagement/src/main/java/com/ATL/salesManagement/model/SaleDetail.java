package com.ATL.salesManagement.model;
import jakarta.persistence.*;

@Entity
@Table(name="sale_detail")
public class SaleDetail {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private int orderQuantity;
    @JoinColumn (name= "id_sale")
    @ManyToOne
    private Sale sale;
    @ManyToOne
    @JoinColumn(name="id_product")
    private Product product;
}
