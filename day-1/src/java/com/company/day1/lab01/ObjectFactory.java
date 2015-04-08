package com.company.day1.lab01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Александр on 06.04.2015.
 */
public class ObjectFactory {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazzToInstantiate = Class.forName(args[0]);
        Object newInstance = clazzToInstantiate.newInstance();
        System.out.println(newInstance);
        Method[] methods = clazzToInstantiate.getMethods();
        for (Method method: methods) {
            RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
            if (annotation != null){
                int repeat = annotation.repeat();
                for (int i = 0; i < repeat; i++) {
                    method.invoke(newInstance);
                }
            }
        }
    }
}
