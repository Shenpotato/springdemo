package com.shenpotato.springdemo;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //1、创建sping的IOC容器对象
        //ApplicationContext 代表IOC容器
        //ClassPathXMLApplicationContext 是ApplicationContext接口的实现类，从类路径下加载配置文件
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");

        //2、从IOC容器中获取Bean实例，是ApplicationContext父类BeanFactory中的方法getbean
        // 通过id定位到IOC容器中的Bean
        HelloWorld helloWorld =(HelloWorld)applicationContext.getBean("helloWorld");
        //通过类型返回IOC容器中的Bean,但要求IOC容器中只能有一个该类型的Bean
        System.out.println(helloWorld);

        //3、调用hello（）方法
        helloWorld.hello();


        //car类
        Car car =(Car)applicationContext.getBean("car");
        System.out.println(car);

        Car car2 = (Car)applicationContext.getBean("car2");
        System.out.println(car2);

        //Person类,List的使用方法，以及外部集合的用法
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        Person person3= (Person)applicationContext.getBean("person3");
        System.out.println(person3);
        Person person4= (Person)applicationContext.getBean("person4");
        System.out.println(person4);
        //NewPerson类，Map的使用方法
        NewPerson newPerson = (NewPerson)applicationContext.getBean("newPerson");
        System.out.println(newPerson);
        //DataSource类，properties的使用方法
        DataSource dataSource = (DataSource)applicationContext.getBean("dataSource");
        System.out.println(dataSource);
    }
}
