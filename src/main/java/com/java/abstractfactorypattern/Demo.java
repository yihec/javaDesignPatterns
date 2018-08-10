package com.java.abstractfactorypattern;

/**
 * Created by 下午 2:12 on 2017/11/29 0029.
 *
 * @create 2017-11-29 下午 2:12
 */
public class Demo {
    public static void main(String[] args) {
        //获取奥迪工厂
        AbstractFactory audiFactory = FactoryProducer.getAudiFactory();
        //生产奥迪A4l
        AudiCar a4L = audiFactory.getAudi("A4L");
        a4L.productCar();

        //生产奥迪A6l
        AudiCar a6L = audiFactory.getAudi("a6l");
        a6L.productCar();

        //获取雪佛兰工厂
        AbstractFactory chevorletFactory = FactoryProducer.getChevroletFactory();
        //生产雪佛兰迈锐宝XL
        ChevroletCar malibuxl = chevorletFactory.getChervolet("MALIBUXL");
        malibuxl.productCar();

        //生产雪佛兰探界者
        ChevroletCar equinox = chevorletFactory.getChervolet("EQUINOX");
        equinox.productCar();

    }
}
