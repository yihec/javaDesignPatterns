package com.java.compositepattern;

import java.io.*;

/**
 * Created by 下午 2:13 on 2017/11/30 0030.
 *
 * @create 2017-11-30 下午 2:13
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        Car car = new AudiCar("奥迪");
        Car car1 = new ChevroletCar("雪佛兰");
        Car car2 = new FordCar("福特");

        Car car3 = new UsaCar();
        car3.add(car1);
        car3.add(car2);
        car3.getCarInfo();



    }
}
