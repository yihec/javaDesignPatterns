package com.java.builderpattern;

/**
 * Created by 下午 3:29 on 2017/11/29 0029.
 * 汽车建造者
 * @create 2017-11-29 下午 3:29
 */
public class CarDirector {
    public Car constructCar(AbstractBuilder carBuilder) {
        carBuilder.buildEngine();
        carBuilder.buildGearbox();
        carBuilder.buildChassis();
        return carBuilder.buildCar();
    }
}
