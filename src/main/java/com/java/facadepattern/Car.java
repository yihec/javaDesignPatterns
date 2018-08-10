package com.java.facadepattern;

/**
 * Created by 下午 5:16 on 2017/11/30 0030.
 *
 * @create 2017-11-30 下午 5:16
 */
public interface Car {

    void carInfo();

}

class AudiCar implements Car{

    @Override
    public void carInfo() {
        System.out.println("奥迪车");
    }
}
class ChevroletCar implements Car{

    @Override
    public void carInfo() {
        System.out.println("雪佛兰车");
    }
}
//提供统一的接口管理
class BuyCar{
    private Car audiCar;
    private Car chevroletCar;
    public BuyCar(){
        audiCar = new AudiCar();
        chevroletCar = new ChevroletCar();
    }
    public void buyAudiCar(){
        System.out.println("买，");
        audiCar.carInfo();
    }

    public void buyChevroletCar(){
        System.out.println("买，");
        chevroletCar.carInfo();
    }
}