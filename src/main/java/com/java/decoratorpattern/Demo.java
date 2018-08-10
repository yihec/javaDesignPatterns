package com.java.decoratorpattern;

/**
 * Created by 下午 3:57 on 2017/11/30 0030.
 *
 * @create 2017-11-30 下午 3:57
 */
public class Demo {
    public static void main(String[] args) {
        //汽车价格
        CarInterface car = new Car();
        System.out.println("汽车价格："+car.getCarPrice());
       //汽车加装导航
        CarInterface car2 = new Decorator2(new Car());
        System.out.println("加装导航，总价格"+car2.getCarPrice());
        //加装天窗，加装导航
        CarInterface car3 = new Decorator3(new Decorator2(new Car()));
        System.out.println("加装导航，加装天窗，总价格"+car3.getCarPrice());
    }
}
