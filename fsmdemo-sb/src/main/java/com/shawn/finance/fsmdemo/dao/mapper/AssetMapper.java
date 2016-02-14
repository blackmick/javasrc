package com.shawn.finance.fsmdemo.dao.mapper;

import com.shawn.finance.fsmdemo.model.Asset;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by shawn on 16/2/14.
 */
public interface AssetMapper {
    @Select("SELECT * FROM tbl_asset_detail limit #{start}, #{ret_num}")
    public List<Asset> getList(@Param("start")int start, @Param("ret_num")int retNum);
}
