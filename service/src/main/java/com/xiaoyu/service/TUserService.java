package com.xiaoyu.service;

import com.xiaoyu.domain.TUser;

/**
 * @author shkstart@create 2019-09-22 21:12
 */
public interface TUserService {
    int insert(TUser record);

    int insertSelective(TUser record);

    /**
     * z注册
     * */
    int regosterTUser(TUser tUser);
}
