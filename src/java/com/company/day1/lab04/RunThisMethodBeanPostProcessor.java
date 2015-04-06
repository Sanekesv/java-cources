package com.company.day1.lab04;

import com.company.day1.lab01.RunThisMethod;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Александр on 06.04.2015.
 */
public class RunThisMethodBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        Method[] methods = bean.getClass().getMethods();
        for (Method method: methods){
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation!=null){
                int repeat = annotation.repeat();
                for (int i = 0; i < repeat; i++) {
                    try {
                        method.invoke(bean);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println("BPP runs on "+ s + "!");
        return bean;

    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
