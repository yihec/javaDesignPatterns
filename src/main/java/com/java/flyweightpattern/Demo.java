package com.java.flyweightpattern;

/**
 * Created by 上午 10:23 on 2017/12/1 0001.
 *
 * @create 2017-12-01 上午 10:23
 */
public class Demo {
    private static final String colors[] =
            { "红色", "蓝色", "黑色", "灰色"};
    private static final String brand[] =
            { "奥迪", "宝马", "奔驰", "大众"};
    public static void main(String[] args) {
        //随机生成20次对象  但是只会初始化4次汽车对象
        for(int i=0; i < 20; ++i) {
            Car car =(Car)CarFactory.getCar(getRandomBrand());
            car.setColor(getRandomColor());
            car.carInfo();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }

    private static String getRandomBrand() {
        return brand[(int)(Math.random()*brand.length)];
    }

}
