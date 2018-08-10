package com.java.adapterpattern;

/**
 * Created by 下午 5:59 on 2017/11/29 0029.
 * 适配器角色:扩展源角色，实现目标角色，从而使得目标角色改动时候，不用改动源角色，只要改动适配器
 * 可以看成什么车都卖的二级汽车经销商
 * @create 2017-11-29 下午 5:59
 */
public class Adapter  extends Adaptee implements Target{
    @Override
    public void buyChevorletCar() {
        System.out.println("去雪佛兰4s店买雪佛兰车");
    }
}
