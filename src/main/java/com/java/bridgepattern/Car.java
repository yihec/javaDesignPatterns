package com.java.bridgepattern;

/**
 * Created by 上午 10:20 on 2017/11/30 0030.
 *
 * @create 2017-11-30 上午 10:20
 */
public abstract class Car {
    protected BuyCar buyCar;
    protected Car(BuyCar buyCar){
        this.buyCar=buyCar;
    }
    protected abstract void car();
}
class AudiCar extends Car{

    public AudiCar(BuyCar buyCar){
        super(buyCar);
    }
    @Override
    protected void car() {
        System.out.println("这是奥迪");
       buyCar.buyCar();
    }
}

class ChevroletCar extends Car{
    public ChevroletCar(BuyCar buyCar){
        super(buyCar);
    }
    @Override
    protected void car() {
        System.out.println("这是雪佛兰");
        buyCar.buyCar();
    }
}