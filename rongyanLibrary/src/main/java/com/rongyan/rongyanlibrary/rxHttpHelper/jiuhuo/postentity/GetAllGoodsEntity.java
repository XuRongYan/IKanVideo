package com.rongyan.rongyanlibrary.rxHttpHelper.jiuhuo.postentity;

import java.util.Objects;

/**
 * Created by Administrator on 2018/5/4 0004 -20:21.
 */
public class GetAllGoodsEntity {
    public int merchantid;

    public GetAllGoodsEntity(int merchantid) {
        this.merchantid = merchantid;
    }

    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetAllGoodsEntity that = (GetAllGoodsEntity) o;
        return merchantid == that.merchantid;
    }

    @Override
    public int hashCode() {

        return Objects.hash(merchantid);
    }

    @Override
    public String toString() {
        return "GetAllGoodsEntity{" +
                "merchantid=" + merchantid +
                '}';
    }
}
