package com.netcorner.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by shijiufeng on 2019/3/6.
 */
@Component
public class SpringTools {
    private static ApplicationContext applicationContext;

    public SpringTools() {
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext = applicationContext;
    }


    public static Object getBean(String id) {
        Object object = null;
        object = applicationContext.getBean(id);
        return object;
    }

    public static Object getBeans(Class<?> cls) {
        Object object = null;
        object = applicationContext.getBeansOfType(cls);
        return object;
    }
}
