package com.ccut.gmall.service;

import com.ccut.gmall.bean.PmsProductImage;
import com.ccut.gmall.bean.PmsProductInfo;
import com.ccut.gmall.bean.PmsProductSaleAttr;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);

    void saveSpuInfo(PmsProductInfo pmsProductInfo);

    List<PmsProductSaleAttr> spuSaleAttrList(String spuId);

    List<PmsProductImage> spuImageList(String spuId);
}
