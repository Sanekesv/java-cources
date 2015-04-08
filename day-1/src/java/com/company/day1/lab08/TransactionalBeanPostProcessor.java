package com.company.day1.lab08;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александр on 06.04.2015.
 */
public class TransactionalBeanPostProcessor implements BeanPostProcessor {
    private List<String> shouldTransformList = new ArrayList<String>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        if (bean.getClass().getAnnotation(Transactional.class) == null) {
            shouldTransformList.add(s);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String s) throws BeansException {if (shouldTransformList.contains(s)) {
        return Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Open transaction");
                Object result = method.invoke(proxy, args);
                System.out.println("Close transaction. commit");
                return result;
            }
        });
    }
        return bean;

    }
}
