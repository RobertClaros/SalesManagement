package com.ATL.salesManagement.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre")
    private String name;
    private String dni;
    private String email;
    @OneToMany(mappedBy = "customer")
    private List<Sale> sales;

}
