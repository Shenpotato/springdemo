package com.shenpotato.springbeanfactory;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shen_potato on 2018/11/20.
 * 静态工厂方法：直接调用某一个类的静态方法就可以返回Bean的实例
 */
public class StaticCarFactory {

    public static Map<String,Car> cars = new HashMap<String,Car>();

    static{
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",200000));
    }

    //静态工厂方法
    public static Car getCar(String name){
        return cars.get(name);
    }
}
