package com.java.abstractfactorypattern;

/**
 * Created by 下午 12:02 on 2017/11/29 0029.
 *
 * @create 2017-11-29 下午 12:02
 */
public interface ChevroletCar {

    void productCar();

}
class ChevroletEquinox implements ChevroletCar{

    @Override
    public void productCar() {
        System.out.println("这是雪佛兰探界者");
    }
}
class ChevroletMalibuXl implements ChevroletCar {
    @Override
    public void productCar() {

        System.out.println("这是雪佛兰迈锐宝XL");
    }
}