package com.shawn.finance.assetmanagement.model;

/**
 * Created by shawn on 16/2/23.
 */
public class AssetPlanDetail {
    private Asset asset;
    private AssetCustomer Customer;
    private AssetMerchant assetMerchant;
    private AssetManager assetManager;
    private AssetPlan assetPlan;

    public void setAsset(Asset asset){
        this.asset = asset;
    }

    public Asset getAsset(){
        return this.asset;
    }

    public void setAssetMerchant(AssetMerchant assetMerchant){
        this.assetMerchant = assetMerchant;
    }

    public AssetMerchant getAssetMerchant(){
        return this.assetMerchant;
    }
}
