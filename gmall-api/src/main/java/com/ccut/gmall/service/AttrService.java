package com.ccut.gmall.service;

import com.ccut.gmall.bean.PmsBaseAttrInfo;
import com.ccut.gmall.bean.PmsBaseAttrValue;
import com.ccut.gmall.bean.PmsBaseSaleAttr;

import java.util.List;


public interface AttrService {

    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
