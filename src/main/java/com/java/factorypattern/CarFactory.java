package com.java.factorypattern;

/**
 * Created by 上午 11:41 on 2017/11/29 0029.
 * 汽车工厂类
 * @create 2017-11-29 上午 11:41
 */
public class CarFactory {

    public Car getAudi(){
        return new AudiCar();
    }

    public Car getChevrolet(){
        return new ChevroletCar();
    }
}
