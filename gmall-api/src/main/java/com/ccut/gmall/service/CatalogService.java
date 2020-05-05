package com.ccut.gmall.service;

import com.ccut.gmall.bean.PmsBaseCatalog1;
import com.ccut.gmall.bean.PmsBaseCatalog2;
import com.ccut.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {
    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
