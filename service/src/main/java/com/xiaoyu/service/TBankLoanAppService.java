package com.xiaoyu.service;

import com.xiaoyu.domain.TBankLoanApp;

/**
 * @author shkstart@create 2019-09-22 18:07
 */
public interface TBankLoanAppService {

    public int deleteByPrimaryKey(Long id);

    public int insert(TBankLoanApp record);

    public int insertSelective(TBankLoanApp record);

    public TBankLoanApp selectByPrimaryKey(Long id);

    public int updateByPrimaryKeySelective(TBankLoanApp record);

    public int updateByPrimaryKey(TBankLoanApp record);
}
