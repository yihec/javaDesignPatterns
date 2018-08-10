package com.java.builderpattern;

//抽象建造者，制定每一种产品应该实现的组合方式
public  abstract class AbstractBuilder{

    public abstract void buildEngine();

    public abstract void buildGearbox();

    public abstract void buildChassis();

    abstract Car buildCar();

}
class ChevroletBuilder extends AbstractBuilder {
    Car car ;
    public ChevroletBuilder() {
        car = new Car();
    }
    @Override
    public void buildEngine() {
        car.setEngine("生产雪佛兰1.5T发动机");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("生产雪佛兰变速箱");
    }

    @Override
    public void buildChassis() {
        car.setChassis("生产雪佛兰底盘");

    }

    @Override
    Car buildCar() {
        return car;
    }

}
class AudiBuilder extends AbstractBuilder {
    Car car ;
    public AudiBuilder() {
        car = new Car();
    }
    @Override
    public void buildEngine() {
        car.setEngine("生产奥迪2.0T发动机");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("生产奥迪变速箱");
    }

    @Override
    public void buildChassis() {
        car.setChassis("生产奥迪底盘");

    }

    @Override
    Car buildCar() {
        return car;
    }


}
