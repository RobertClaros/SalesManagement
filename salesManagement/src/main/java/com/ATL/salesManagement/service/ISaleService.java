package com.ATL.salesManagement.service;

import com.ATL.salesManagement.model.Sale;
import com.ATL.salesManagement.model.SaleDetail;

import java.sql.Date;
import java.util.List;

public interface ISaleService {
    List<Sale> findAll();
    void saveSale( Sale sale);
    Sale findById(Long id_sale);
    void deleteSale(Long id_sale);
    void editSale(Long id_sale, Date newDAte, List<SaleDetail> saleDetailList);
}
