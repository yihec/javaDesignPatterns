package com.java.filterpattern;

/**
 * Created by 上午 11:00 on 2017/11/30 0030.
 *
 * @create 2017-11-30 上午 11:00
 */
public class Car {
    //汽车类型  有suv跟家用轿车
    private String type;
   //生产地址   有美国跟中国
    private String   aroductionAddress;
    //名称
    private String name;

    public Car(String type, String aroductionAddress, String name) {
        this.type = type;
        this.aroductionAddress = aroductionAddress;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAroductionAddress() {
        return aroductionAddress;
    }

    public void setAroductionAddress(String aroductionAddress) {
        this.aroductionAddress = aroductionAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "汽车：" +
                "类型='" + type + '\'' +
                ", 生产地址='" + aroductionAddress + '\'' +
                ", 名称='" + name ;
    }
}
