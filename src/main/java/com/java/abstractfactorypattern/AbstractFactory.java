package com.java.abstractfactorypattern;

/**
 * Created by 下午 1:47 on 2017/11/29 0029.
 * 抽象工厂类
 * @create 2017-11-29 下午 1:47
 */
public abstract class AbstractFactory {

    abstract AudiCar getAudi(String model);

    abstract ChevroletCar getChervolet(String model) ;


}
/**
 * Created by 下午 1:48 on 2017/11/29 0029.
 * 奥迪工厂类
 * @create 2017-11-29 下午 1:48
 */
 class AudiFactory extends AbstractFactory{
    @Override
    AudiCar getAudi(String model) {
        if(model.equalsIgnoreCase("A4L")){
            return new AudiA4l();

        }else if(model.equalsIgnoreCase("A6L")){
            return new AudiA6l();
        }
        return null;
    }

    @Override
    ChevroletCar getChervolet(String model) {
        return null;
    }
}
/**
 * Created by 下午 1:50 on 2017/11/29 0029.
 * 雪佛兰工厂类
 * @create 2017-11-29 下午 1:50
 */
 class ChevroletFactory extends AbstractFactory {

    @Override
    AudiCar getAudi(String model) {
        return null;
    }

    @Override
    ChevroletCar getChervolet(String model) {
        if(model.equalsIgnoreCase("MALIBUXL")){
            return new ChevroletMalibuXl();

        }else if (model.equalsIgnoreCase("EQUINOX")){
            return  new ChevroletEquinox();

        }
        return null;
    }
}
