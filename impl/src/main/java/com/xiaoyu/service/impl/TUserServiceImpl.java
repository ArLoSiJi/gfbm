package com.xiaoyu.service.impl;

import com.xiaoyu.dao.TUserMapper;
import com.xiaoyu.domain.TUser;
import com.xiaoyu.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shkstart@create 2019-09-22 21:25
 */
@Service("tUserService")
public class TUserServiceImpl implements TUserService {

    @Autowired
    private TUserMapper tUserMapper;

    @Override
    public int insert(TUser record) {
        int insert = tUserMapper.insert(record);
        return insert;
    }

    @Override
    public int insertSelective(TUser record) {
        int i = tUserMapper.insertSelective(record);
        return i;
    }


    /**
     * 注册用户
     * */
    @Override
    public int regosterTUser(TUser tUser) {
     int i= tUserMapper.regosterTUser(tUser);
     return i;
    }


}
