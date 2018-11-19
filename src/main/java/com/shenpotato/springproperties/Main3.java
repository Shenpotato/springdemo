package com.shenpotato.springproperties;

import com.mchange.v2.c3p0.DataSources;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by Shen_potato on 2018/11/19.
 */
public class Main3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("propertiesContext.xml");
        DataSource dataSource = (DataSource)applicationContext.getBean("datasource");
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
