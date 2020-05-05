package com.ccut.gmall.user.mapper;

import com.ccut.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @description:
 * @author: Sunwei
 * @time: 2020/4/29 10:47 PM
 */


public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();

}