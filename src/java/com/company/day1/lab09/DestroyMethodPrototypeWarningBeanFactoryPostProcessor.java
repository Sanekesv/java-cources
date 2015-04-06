package com.company.day1.lab09;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * Created by Александр on 06.04.2015.
 */
public class DestroyMethodPrototypeWarningBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefName : beanDefinitionNames) {
            GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition(beanDefName);
            if (beanDefinition.isPrototype() && beanDefinition.getDestroyMethodName() != null) {
                System.out.println("WARN: Dostry method won't call for bean " + beanDefinition.getBeanClassName());
            }

        }
    }
}
