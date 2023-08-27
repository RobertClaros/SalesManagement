package com.ATL.salesManagement.service;

import com.ATL.salesManagement.model.SaleDetail;

import java.util.List;

public interface ISaleDetailService {
    List<SaleDetail> findSaleDetailList();
    void saveSaleDetail(SaleDetail saleDetail);
    SaleDetail findBySaleDetail(Long id_saleDetail);
    void deleteSaleDetail(Long id_saleDetail);
}
