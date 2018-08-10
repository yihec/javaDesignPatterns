package com.java.prototypepattern;

/**
 * Created by 下午 4:59 on 2017/11/29 0029.
 *
 * @create 2017-11-29 下午 4:59
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        Car car = new Car();
        car.setEngine("1.5T发动机");
        car.setChassis("底盘");
        car.setGearbox("自动变速箱");


        AudiA6lCar audiA6lCar = new AudiA6lCar();
        audiA6lCar.setColor("红色");
        car.setAudiA6lCar(audiA6lCar);

        Car car2 = car.clone();
        AudiA6lCar audiA6lCar2 = new AudiA6lCar();
        audiA6lCar2.setColor("蓝色");
        car2.setAudiA6lCar(audiA6lCar2);
        car2.setEngine("2.0T发动机");

        System.out.println(car.toString());

        System.out.println();
        System.out.println(car2.toString());

        System.out.println(car2==car);

    }
}
