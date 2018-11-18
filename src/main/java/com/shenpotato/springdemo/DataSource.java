package com.shenpotato.springdemo;

import java.util.Properties;

/**
 * Created by Shen_potato on 2018/11/18.
 */
public class DataSource {
    private Properties properties;

    @Override
    public String toString() {
        return "DataSource{" +
                "properties=" + properties +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

}
