package com.java.factorypattern;

/**
 * Created by 上午 11:40 on 2017/11/29 0029.
 * 雪佛兰汽车接口实现类
 * @create 2017-11-29 上午 11:40
 */
public class ChevroletCar implements Car{
    @Override
    public void buyCar() {
        System.out.println("这个车是雪佛兰");
    }
}
