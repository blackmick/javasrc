package com.shawn.finance.assetmanagement.service;

import com.shawn.finance.assetmanagement.dao.mapper.AssetMapper;
import com.shawn.finance.assetmanagement.model.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shawn on 16/2/14.
 */
@Service
public class AssetService {
    @Autowired
    private AssetMapper assetDao;

    public List<Asset> getList(int start, int retNum){
        return assetDao.getList(start, retNum);
    }
}
