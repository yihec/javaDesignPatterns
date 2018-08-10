package com.java.builderpattern;

/**
 * Created by 下午 3:02 on 2017/11/29 0029.
 * @create 2017-11-29 下午 3:02
 */
public class Car {
    //发动机
    private String engine;
    //变速箱
    private String gearbox;
    //底盘
    private String chassis;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String toString(){
        return "开始生产汽车，开始"+this.engine+"\n"+this.gearbox+"\n"+this.chassis;
    }
}
