package com.java.bridgepattern;

/**
 * Created by 上午 10:35 on 2017/11/30 0030.
 *
 * @create 2017-11-30 上午 10:35
 */
public class Demo {
    public static void main(String[] args) {
        Car buyAudicar = new AudiCar(new BuyAudiCar());
        Car buyChevroletCar = new ChevroletCar(new BuyChevroletCar());

        buyAudicar.car();
        buyChevroletCar.car();

    }
}
