package com.java.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 上午 11:23 on 2017/11/30 0030.
 *
 * @create 2017-11-30 上午 11:23
 */
public class Demo {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("suv","美国","雪佛兰探险者"));
        cars.add(new Car("家用轿车","美国","福特蒙迪欧"));
        cars.add(new Car("家用轿车","美国","雪佛兰迈锐宝"));
        cars.add(new Car("suv","中国","吉利博越"));
        cars.add(new Car("suv","中国","领克01"));
        cars.add(new Car("家用轿车","中国","吉利博瑞"));
        //获取所有suv车型
        System.out.println("获取所有suv车型");
        Filter filter = new suvfilter();
        print(filter.filter(cars));
        //获取所有家用轿车
        System.out.println("获取所有家用轿车");
        Filter filter1 = new OtherCarTypeFilter();
        print(filter1.filter(cars));
        //获取所有中国生产的汽车
        System.out.println("获取所有中国生产的汽车");
        Filter filter2 = new ChinaFilter();
        print(filter2.filter(cars));
        //获取所有中国生产的suv
        System.out.println("获取所有中国生产的suv");
        Filter filter3 = new AndFilter(new ChinaFilter(),new suvfilter());
        print(filter3.filter(cars));
        //获取所有中国生产的家用轿车
        System.out.println("获取所有中国生产的家用轿车");
        Filter filter4 = new AndFilter(new ChinaFilter(),new OtherCarTypeFilter());
        print(filter4.filter(cars));
        //获取中国生产的所有车型的跟其他国家的suv
        System.out.println("获取中国的跟所有的suv");
        Filter filter5 = new OrFilter(new ChinaFilter(),new suvfilter());
        print(filter5.filter(cars));
        //获取中国生产的所有车型的跟其他国家的家用轿车
        System.out.println("获取中国生产的所有车型的跟其他国家的家用轿车");
        Filter filter6 = new OrFilter(new ChinaFilter(),new OtherCarTypeFilter());
        print(filter6.filter(cars));
    }
    public static void print(List<Car> list){
        for (Car car:list)
            System.out.println(car.toString());
        System.out.println();
    }
}
