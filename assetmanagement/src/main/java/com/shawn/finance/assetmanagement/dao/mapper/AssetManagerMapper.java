package com.shawn.finance.assetmanagement.dao.mapper;

import org.apache.ibatis.annotations.Insert;
import com.shawn.finance.assetmanagement.model.AssetManager;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by shawn on 16/2/6.
 */
public interface AssetManagerMapper {
    @Insert("INSERT INTO tbl_asset_manager () VALUES ()")
    public void addAssetManager(AssetManager am);

    @Select("SELECT * FROM tbl_asset_manager WHERE id = #{id}")
    public AssetManager getById(Long id);

    @Select("SELECT * FROM tbl_asset_manager WHERE bank_name = #{bankName}")
    public List<AssetManager> getByBankName(String bankName);

    @Select("SELECT * FROM tbl_asset_manager LIMIT #{start}, #{number}")
    public List<AssetManager> getList(@Param("start")long start, @Param("number")long number);

    @Update("Update tbl_asset_manager SET () VALUES()")
    public AssetManager updateById(@Param("id") long id, @Param("am")AssetManager am);
}
