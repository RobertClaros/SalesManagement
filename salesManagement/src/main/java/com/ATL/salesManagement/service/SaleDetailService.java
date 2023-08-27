package com.ATL.salesManagement.service;

import com.ATL.salesManagement.model.SaleDetail;
import com.ATL.salesManagement.repository.IProductRepository;
import com.ATL.salesManagement.repository.ISaleDetailRepository;
import com.ATL.salesManagement.repository.ISaleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SaleDetailService implements ISaleDetailService{
    @Autowired
    ISaleDetailRepository saleDetailRepository;
  /*  @Autowired
    IProductRepository productRepository;
    @Autowired

    ISaleRepository saleRepository;
   */
    @Override
    public List<SaleDetail> findSaleDetailList() {
        List<SaleDetail> saleDetailList = saleDetailRepository.findAll();
        return saleDetailList;
    }

    @Override
    public void saveSaleDetail(SaleDetail saleDetail) {
        saleDetailRepository.save(saleDetail);
    }

    @Override
    public SaleDetail findBySaleDetail(Long id_saleDetail) {
        SaleDetail saleDetail = (SaleDetail) saleDetailRepository.findById(id_saleDetail).orElse(null
        );
        return saleDetail;
    }

    @Override
    public void deleteSaleDetail(Long id_saleDetail) {
        saleDetailRepository.deleteById(id_saleDetail);
    }
}
