package com.java.proxypattern.Jdkproxy;

/**
 * Created by 下午 1:43 on 2017/12/1 0001.
 *
 * @create 2017-12-01 下午 1:43
 */
public class Demo {
    public static void main(String[] args) {
        BuyCar buyCar = new BuyAudiCar();

        ProxyFactory proxyFactory = new ProxyFactory(buyCar);


        BuyCar buyAudiCarProxy = (BuyCar)proxyFactory.getProxyInstance();

        buyAudiCarProxy.buyCar();

    }
}
