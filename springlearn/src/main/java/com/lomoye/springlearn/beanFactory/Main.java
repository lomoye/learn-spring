package com.lomoye.springlearn.beanFactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by lomoye on 2017/8/7.
 *
 */
public class Main {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("application-context.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);

        User user = (User) beanFactory.getBean("user");
        System.out.println(user.getId() + "|" + user.getName());
    }
}
