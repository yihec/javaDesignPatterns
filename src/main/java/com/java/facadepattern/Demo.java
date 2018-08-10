package com.java.facadepattern;

/**
 * Created by 下午 5:22 on 2017/11/30 0030.
 *
 * @create 2017-11-30 下午 5:22
 */
public class Demo {
    public static void main(String[] args) {
       BuyCar buyCar = new BuyCar();
       //买奥迪
        buyCar.buyAudiCar();
        //买雪佛兰
        buyCar.buyChevroletCar();
    }
}
