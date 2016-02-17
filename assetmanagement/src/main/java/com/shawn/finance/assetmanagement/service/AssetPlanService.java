package com.shawn.finance.assetmanagement.service;

import com.shawn.finance.assetmanagement.dao.mapper.AssetPlanMapper;
import com.shawn.finance.assetmanagement.model.AssetPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by shawn on 16/2/14.
 */
@Component
public class AssetPlanService {
    @Autowired
    private AssetPlanMapper assetPlanDao;

    public List<AssetPlan> getList(int start, int retNum){
        return assetPlanDao.getList(start, retNum);
    }
}
