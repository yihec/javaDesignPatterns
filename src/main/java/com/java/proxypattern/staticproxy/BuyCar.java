package com.java.proxypattern.staticproxy;

/**
 * Created by 上午 11:41 on 2017/12/1 0001.
 * 静态代理
 * @create 2017-12-01 上午 11:41
 */
public interface BuyCar {
    void buyCar();
}
//可以看成去品牌4s店购买
class BuyAudiCar implements  BuyCar{

    @Override
    public void buyCar() {
        System.out.println("去奥迪4s店购买");
    }
}
class BuyCarProxy implements BuyCar{
    private BuyAudiCar buyAudiCar;

    public BuyCarProxy(BuyAudiCar buyAudiCar){
        this.buyAudiCar=buyAudiCar;
    }

    @Override
    public void buyCar() {
        System.out.println("去代理商买,代理商");
        buyAudiCar.buyCar();
    }
}