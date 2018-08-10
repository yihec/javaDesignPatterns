package com.java.factorypattern;

/**
 * Created by 上午 11:37 on 2017/11/29 0029.
 * 奥迪汽车接口实现类
 * @create 2017-11-29 上午 11:37
 */
public class AudiCar implements Car {

    @Override
    public void buyCar() {
        System.out.println("这个车是奥迪");
    }
}
