package com.java.prototypepattern;

/**
 * Created by 下午 3:02 on 2017/11/29 0029.
 * @create 2017-11-29 下午 3:02
 */
public class Car  implements Cloneable{
    //发动机
    private String engine;
    //变速箱
    private String gearbox;
    //底盘
    private String chassis;

    private AudiA6lCar audiA6lCar;

    public AudiA6lCar getAudiA6lCar() {
        return audiA6lCar;
    }

    public void setAudiA6lCar(AudiA6lCar audiA6lCar) {
        this.audiA6lCar = audiA6lCar;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car)super.clone();
    }

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
    @Override
    public String toString() {
        return "奥迪a6L  发动机："+this.getEngine()+"\n"+"变速箱:"+this.getGearbox()+"\n"+"底盘："+this.getChassis()+"\n"+"颜色："+audiA6lCar.getColor();
    }
}
