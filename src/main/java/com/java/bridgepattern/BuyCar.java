package com.java.bridgepattern;

/**
 * Created by 上午 10:17 on 2017/11/30 0030.
 *
 * @create 2017-11-30 上午 10:17
 */
public interface BuyCar {

    void  buyCar();
}

class BuyAudiCar implements BuyCar{

    @Override
    public void buyCar() {
        System.out.println("买奥迪车");
    }
}

class BuyChevroletCar implements BuyCar{

    @Override
    public void buyCar() {
        System.out.println("买雪佛兰");
    }
}