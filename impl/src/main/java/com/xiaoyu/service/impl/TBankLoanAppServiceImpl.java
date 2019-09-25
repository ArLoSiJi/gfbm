package com.xiaoyu.service.impl;

import com.xiaoyu.dao.TBankLoanAppMapper;
import com.xiaoyu.domain.TBankLoanApp;
import com.xiaoyu.service.TBankLoanAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shkstart@create 2019-09-22 18:07
 */
@Service("tBankLoanAppService")
public class TBankLoanAppServiceImpl implements TBankLoanAppService {

    @Autowired
    private TBankLoanAppMapper tBankLoanAppMapper;



    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    public int insert(TBankLoanApp record) {
        return 0;
    }

    public int insertSelective(TBankLoanApp record) {
        return 0;
    }

    public TBankLoanApp selectByPrimaryKey(Long id) {
        TBankLoanApp tBankLoanApp = tBankLoanAppMapper.selectByPrimaryKey(id);
        return tBankLoanApp;
    }

    public int updateByPrimaryKeySelective(TBankLoanApp record) {
        return 0;
    }

    public int updateByPrimaryKey(TBankLoanApp record) {
        return 0;
    }
}
