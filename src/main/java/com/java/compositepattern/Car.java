package com.java.compositepattern;

import java.util.ArrayList;

/**
 * Created by 下午 1:58 on 2017/11/30 0030.
 * 汽车销量
 * @create 2017-11-30 下午 1:58
 */
public interface Car {
     void add(Car car);
     void remove(Car file);
     Car getChild(int i);
     void getCarInfo();
}

class AudiCar implements  Car{
    private String name;

    public AudiCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void add(Car car) {

    }

    @Override
    public void remove(Car file) {

    }

    @Override
    public Car getChild(int i) {
        return null;
    }

    @Override
    public void getCarInfo() {
        System.out.println("这是"+name+"汽车");
    }
}
class ChevroletCar implements  Car{
    private String name;
    public ChevroletCar(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void add(Car car) {

    }

    @Override
    public void remove(Car file) {

    }

    @Override
    public Car getChild(int i) {
        return null;
    }

    @Override
    public void getCarInfo() {
        System.out.println("这是"+name+"汽车");
    }
}
class FordCar implements  Car{
    private String name;
    public FordCar(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void add(Car car) {

    }

    @Override
    public void remove(Car file) {

    }

    @Override
    public Car getChild(int i) {
        return null;
    }

    @Override
    public void getCarInfo() {
        System.out.println("这是"+name+"汽车");
    }
}

class UsaCar implements Car{
    private ArrayList<Car> carList=new ArrayList<Car>();

    @Override
    public void add(Car car) {
        carList.add(car);
    }

    @Override
    public void remove(Car car) {
        carList.remove(car);
    }

    @Override
    public Car getChild(int i) {
        return null;
    }

    @Override
    public void getCarInfo() {
        System.out.println("美系汽车");
        for (Car o:carList ){
            o.getCarInfo();
        }
    }
}


