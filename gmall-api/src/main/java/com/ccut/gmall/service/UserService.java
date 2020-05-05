package com.ccut.gmall.service;

import com.ccut.gmall.bean.UmsMember;
import com.ccut.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
