package com.java.abstractfactorypattern;

/**
 * Created by 下午 12:02 on 2017/11/29 0029.
 *
 * @create 2017-11-29 下午 12:02
 */
public interface AudiCar {

    void productCar();

}
class AudiA4l implements AudiCar{
    @Override
    public void productCar() {
        System.out.println("这是奥迪A4L");
    }
}
class AudiA6l implements AudiCar{
    @Override
    public void productCar() {
        System.out.println("这是奥迪A6L");
    }
}