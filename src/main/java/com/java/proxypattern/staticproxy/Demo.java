package com.java.proxypattern.staticproxy;

/**
 * Created by 上午 11:46 on 2017/12/1 0001.
 *
 * @create 2017-12-01 上午 11:46
 */
public class Demo {
    public static void main(String[] args) {

        BuyAudiCar buyAudiCar = new BuyAudiCar();
        BuyCarProxy buyCarProxy = new BuyCarProxy(buyAudiCar);
        buyCarProxy.buyCar();
    }
}
