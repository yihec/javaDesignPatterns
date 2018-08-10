package com.java.filterpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 上午 11:05 on 2017/11/30 0030.
 *
 * @create 2017-11-30 上午 11:05
 */
public interface Filter {
    List<Car> filter(List<Car> list);
}

class suvfilter implements Filter{
   //得到所有suv车型
    @Override
    public List<Car> filter(List<Car> list) {
        List<Car> result = new ArrayList<Car>();
        for (Car car : list) {
            if ("SUV".equalsIgnoreCase(car.getType())) {
                result.add(car);
            }
        }
        return result;
    }
}
class OtherCarTypeFilter implements Filter{
    //得到家用轿车车型
    @Override
    public List<Car> filter(List<Car> list) {
        List<Car> result = new ArrayList<Car>();
        for (Car car : list) {
            if ("家用轿车".equalsIgnoreCase(car.getType())) {
                result.add(car);
            }
        }
        return result;
    }
}
class ChinaFilter implements Filter{
    //得到中国生产的
    @Override
    public List<Car> filter(List<Car> list) {
        List<Car> result = new ArrayList<Car>();
        for (Car car : list) {
            if ("中国".equalsIgnoreCase(car.getAroductionAddress())) {
                result.add(car);
            }
        }
        return result;
    }
}
class AndFilter implements Filter{
    private Filter filter;
    private Filter otherFilter;
    public AndFilter(Filter filter,Filter otherFilter){
        this.filter=filter;
        this.otherFilter=otherFilter;
    }
    @Override
    public List<Car> filter(List<Car> list) {
        List<Car> cars = filter.filter(list);
        return otherFilter.filter(cars);
    }
}
class OrFilter implements Filter{
    private Filter filter;
    private Filter otherFilter;
    public OrFilter(Filter filter,Filter otherFilter){
        this.filter=filter;
        this.otherFilter=otherFilter;
    }
    @Override
    public List<Car> filter(List<Car> list) {
        List<Car> cars = filter.filter(list);
        List<Car> cars2 = otherFilter.filter(list);
        //去重取并集
        cars2.removeAll(cars);
        cars.addAll(cars2);
        return cars;
    }
}