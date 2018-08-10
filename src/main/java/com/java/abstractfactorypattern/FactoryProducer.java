package com.java.abstractfactorypattern;

/**
 * Created by 下午 2:00 on 2017/11/29 0029.
 * 创建一个工厂创造器/生成器类，来获取工厂。
 * @create 2017-11-29 下午 2:00
 */
public class FactoryProducer {

    public static AbstractFactory getAudiFactory(){
        return new AudiFactory();

    }

    public static AbstractFactory getChevroletFactory(){
        return new ChevroletFactory();
    }
}
