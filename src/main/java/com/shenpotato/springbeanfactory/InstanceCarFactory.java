package com.shenpotato.springbeanfactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shen_potato on 2018/11/20.
 * 实例工厂的方法，即先创建工厂本身，再调用工厂的实例方法，来返回bean实例
 */
public class InstanceCarFactory {
    private Map<String,Car> cars =null;

    public InstanceCarFactory(){
        cars = new HashMap<String,Car>();
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",200000));
    }

    public  Car getCar(String name){
        return cars.get(name);
    }
}

