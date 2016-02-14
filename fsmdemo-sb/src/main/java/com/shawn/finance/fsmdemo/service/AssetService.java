package com.shawn.finance.fsmdemo.service;

import com.shawn.finance.fsmdemo.dao.mapper.AssetMapper;
import com.shawn.finance.fsmdemo.model.Asset;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by shawn on 16/2/14.
 */
public class AssetService {
    @Autowired
    private AssetMapper assetDao;

    public List<Asset> getList(int start, int retNum){
        return assetDao.getList(start, retNum);
    }
}
