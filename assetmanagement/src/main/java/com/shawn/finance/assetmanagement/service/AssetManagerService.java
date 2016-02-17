package com.shawn.finance.assetmanagement.service;

import com.shawn.finance.assetmanagement.dao.mapper.AssetManagerMapper;
import com.shawn.finance.assetmanagement.model.AssetManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by shawn on 16/2/6.
 */
@Component
public class AssetManagerService {
    @Autowired
    AssetManagerMapper assetManagerDao;

    public AssetManager getById(Long id){
        return assetManagerDao.getById(id);
    }

    public List<AssetManager> getByBankName(String bankName){
        return assetManagerDao.getByBankName(bankName);
    }

    public List<AssetManager> getList(long start, long number){
        return assetManagerDao.getList(start, number);
    }
}
