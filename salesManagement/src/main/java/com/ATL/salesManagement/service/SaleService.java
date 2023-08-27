package com.ATL.salesManagement.service;

import com.ATL.salesManagement.model.Sale;
import com.ATL.salesManagement.model.SaleDetail;
import com.ATL.salesManagement.repository.ISaleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.List;

public class SaleService implements ISaleService{
    @Autowired
    ISaleRepository saleRepository;
    @Override
    public List<Sale> findAll() {
        List<Sale> salelist = saleRepository.findAll();
        return salelist;
    }

    @Override
    public void saveSale(Sale sale) {
        saleRepository.save(sale);
    }

    @Override
    public Sale findById(Long id_sale) {
        Sale sale = (Sale) saleRepository.findById(id_sale).orElse(null);
        return sale;
    }

    @Override
    public void deleteSale(Long id_sale) {
        saleRepository.delete(id_sale);
    }

    @Override
    public void editSale(Long id_sale, Date newDAte, List<SaleDetail> saleDetailList) {
            Sale sale = findById(id_sale);
            sale.setDate(newDAte);
            sale.setSaleDetailList(saleDetailList);
            this.saveSale(sale);
    }
}
