package com.xiaoyu.controller;

import com.xiaoyu.service.TBankLoanAppService;
import com.xiaoyu.domain.TBankLoanApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author shkstart@create 2019-09-22 18:09
 */

/**
 * 银行借款controller
 */
@Controller
public class TBankLoanAppController {

    @Autowired
    private TBankLoanAppService tBankLoanAppService;

    /**
     * 删除
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(Long id) {
        int i = tBankLoanAppService.deleteByPrimaryKey(id);
        return i;
    }

    /**
     * 新增
     * @param record
     * @return
     */
    public int insert(TBankLoanApp record) {
        int insert = tBankLoanAppService.insert(record);
        return insert;
    }

    /**
     * 新增
     * @param record
     * @return
     */
    public int insertSelective(TBankLoanApp record) {
        int i = tBankLoanAppService.insertSelective(record);
        return i;
    }

    public TBankLoanApp selectByPrimaryKey(Long id) {
        return null;
    }

    public int updateByPrimaryKeySelective(TBankLoanApp record) {
        return 0;
    }

    public int updateByPrimaryKey(TBankLoanApp record) {
        return 0;
    }


}
