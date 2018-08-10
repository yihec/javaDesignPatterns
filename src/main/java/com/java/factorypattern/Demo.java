package com.java.factorypattern;

/**
 * Created by 上午 11:43 on 2017/11/29 0029.
 *
 * @create 2017-11-29 上午 11:43
 */
public class Demo {
    public static void main(String[] args) {
        //创建汽车工厂类
        CarFactory carFactory = new CarFactory();

        Car audiCar = carFactory.getAudi();
        audiCar.buyCar();

        Car chevroletCar = carFactory.getChevrolet();
        chevroletCar.buyCar();

    }

}

