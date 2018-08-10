package com.java.proxypattern.cglibproxy;

/**
 * Created by 下午 2:00 on 2017/12/1 0001.
 *
 * @create 2017-12-01 下午 2:00
 */
public class Demo {
    public static void main(String[] args) {

        BuyCar buyCar = new BuyCar();

        ProxyFactory proxyFactory = new ProxyFactory(buyCar);

        BuyCar  proxy =(BuyCar) proxyFactory.getProxyInstance();

        proxy.buyCar();

    }
}
