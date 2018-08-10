package com.java.flyweightpattern;

import java.util.HashMap;

/**
 * Created by 上午 10:12 on 2017/12/1 0001.
 *
 * @create 2017-12-01 上午 10:12
 */
public class CarFactory {
    //final 修饰的变量是不可更改的，指的是内存的引用不可更改
    private static final HashMap<String,Car> map = new HashMap<String, Car>();

    public static  Car getCar(String color){
        Car car = (Car) map.get(color);
        if(car==null){
            car = new Car(color);
            map.put(color,car);
        }
        return car;
    }

}
