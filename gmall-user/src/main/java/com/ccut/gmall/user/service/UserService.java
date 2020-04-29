package com.ccut.gmall.user.service;

import com.ccut.gmall.user.bean.UmsMember;
import com.ccut.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;
/**
 * @description:
 * @author: Sunwei
 * @time: 2020/4/29 8:25 PM
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}