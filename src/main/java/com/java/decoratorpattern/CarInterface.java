package com.java.decoratorpattern;

/**
 * Created by 下午 3:39 on 2017/11/30 0030.
 * 可以看成给一个汽车不断的加装东西
 * @create 2017-11-30 下午 3:39
 */
public interface CarInterface {
    int getCarPrice();
}
class Car implements CarInterface{
    public Car(){
        System.out.println("汽车：");
    }
    @Override
    public int getCarPrice() {
        return 150000;
    }
}
  abstract class Decorator implements CarInterface{
    protected CarInterface carInterface;
    public Decorator(CarInterface carInterface){
        this.carInterface=carInterface;
    }

 }
 class Decorator2 extends Decorator {

     public Decorator2(CarInterface carInterface) {
         super(carInterface);
     }


     public int getCarPrice() {
         return carInterface.getCarPrice()+2000;
     }
 }
 class Decorator3 extends Decorator {

     public Decorator3(CarInterface carInterface) {
         super(carInterface);
     }


     public int getCarPrice() {
         return carInterface.getCarPrice()+15000;
     }

}