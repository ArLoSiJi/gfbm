package com.xiaoyu.dao;

import com.xiaoyu.domain.TUser;

public interface TUserMapper {

    int insert(TUser record);

    int insertSelective(TUser record);


    /**
     * 注册用户
     * */
    int regosterTUser(TUser tUser);
}