package com.msk.product.logic;

import com.hoperun.jdbc.mybatis.BaseDao;
import com.msk.common.base.BaseLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PD141123Logic
 *
 * @author yuan_chen
 */

@Service
public class PD141123Logic extends BaseLogic {

    /**
     * logger
     */
    private Logger logger = LoggerFactory.getLogger(PD141123Logic.class);

    @Autowired
    @Override
    public void setBaseDao(BaseDao baseDao) {
        super.setBaseDao(baseDao);
    }


}
