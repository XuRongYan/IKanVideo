package com.rongyan.rongyanlibrary.rxHttpHelper.jiuhuo.entity;

import java.util.Objects;

/**
 * Created by Administrator on 2018/5/4 0004 -20:23.
 */
public class Goods {
    public int goodsid;     //货物id
    public String name;     //商品姓名
    public int merchantid;  //商家id
    public int price;       //价格
    public int number;      //数量
    public int hostsell;    //是否为热销商品
    public int recommended; //是否为推荐商品

    public Goods(int goodsid, String name, int merchantid, int price, int number, int hostsell, int recommended) {
        this.goodsid = goodsid;
        this.name = name;
        this.merchantid = merchantid;
        this.price = price;
        this.number = number;
        this.hostsell = hostsell;
        this.recommended = recommended;
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(int merchantid) {
        this.merchantid = merchantid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHostsell() {
        return hostsell;
    }

    public void setHostsell(int hostsell) {
        this.hostsell = hostsell;
    }

    public int getRecommended() {
        return recommended;
    }

    public void setRecommended(int recommended) {
        this.recommended = recommended;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return goodsid == goods.goodsid &&
                merchantid == goods.merchantid &&
                price == goods.price &&
                number == goods.number &&
                hostsell == goods.hostsell &&
                recommended == goods.recommended &&
                Objects.equals(name, goods.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(goodsid, name, merchantid, price, number, hostsell, recommended);
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsid=" + goodsid +
                ", name='" + name + '\'' +
                ", merchantid=" + merchantid +
                ", price=" + price +
                ", number=" + number +
                ", hostsell=" + hostsell +
                ", recommended=" + recommended +
                '}';
    }
}
