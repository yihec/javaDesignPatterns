package com.java.builderpattern;

/**
 * Created by 下午 3:31 on 2017/11/29 0029.
 *
 * @create 2017-11-29 下午 3:31
 */
public class Demo {
    public static void main(String[] args) {
        CarDirector pd = new CarDirector();
        Car audiCar = pd.constructCar(new AudiBuilder());
        System.out.println(audiCar.toString());
        Car ChevroletCar = pd.constructCar(new ChevroletBuilder());
        System.out.println(ChevroletCar.toString());
    }
}
