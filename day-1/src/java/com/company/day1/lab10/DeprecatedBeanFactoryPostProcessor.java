package com.company.day1.lab10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * Created by Александр on 07.04.2015.
 */
public class DeprecatedBeanFactoryPostProcessor implements BeanFactoryPostProcessor{
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        for (String beanDefName : beanFactory.getBeanDefinitionNames()) {
            GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition(beanDefName);

            Class beanClass = null;
            try {
                beanClass = Class.forName(beanDefinition.getBeanClassName());
                DeprecatedSteroids beanClassAnnotation = (DeprecatedSteroids) beanClass.getAnnotation(DeprecatedSteroids.class);
                if (beanClassAnnotation != null) {
                    beanDefinition.setBeanClass(beanClassAnnotation.replacedWith());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new BeanInitializationException("Failed to load bean");
            }
        }
    }
}
