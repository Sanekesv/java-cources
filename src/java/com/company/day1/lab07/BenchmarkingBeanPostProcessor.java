package com.company.day1.lab07;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Александр on 06.04.2015.
 */
public class BenchmarkingBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String s) throws BeansException {
        if (bean.getClass().getAnnotation(Benchmark.class) != null) {
            return Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    if(proxy.getClass().getMethod(method.getName(), method.getParameterTypes()).getAnnotation(Benchmark.class)!=null) {
                        long start = System.currentTimeMillis();
                        Object returnValue = method.invoke(proxy, args);
                        System.out.println("time: " + (start - System.currentTimeMillis()));
                        return returnValue;
                    }
                    return method.invoke(proxy);
                }
            });
        }
        else {
            return bean;
        }

    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
