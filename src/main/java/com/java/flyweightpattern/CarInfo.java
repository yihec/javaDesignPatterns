package com.java.flyweightpattern;

/**
 * Created by 上午 10:03 on 2017/12/1 0001.
 * @create 2017-12-01 上午 10:03
 */
public interface CarInfo {
    //获取汽车信息
    void carInfo();
}
class Car implements CarInfo{
    //品牌
    private String brand;

    //颜色
    private String color;

    public Car(String brand){
        System.out.println("创建了汽车对象");
        this.brand=brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void carInfo() {
        System.out.println( "汽车：" +
                "品牌：'" + brand + '\'' +
                ", 颜色：'" + color);
    }
}

