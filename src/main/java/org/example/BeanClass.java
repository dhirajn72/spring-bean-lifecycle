package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanClass implements BeanNameAware, BeanFactoryAware,
		ApplicationContextAware, InitializingBean, DisposableBean,
		BeanPostProcessor {
	public BeanClass() {
		System.out.println("Constructor()");
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessAfterInitialization()"+arg0);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization()"+arg0);
		return arg0;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println("setApplicationContext()");

	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("setBeanFactory()");

	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("setBeanName()");

	}

	@PreDestroy
	public void method1() {
		System.out.println("@PreDestroy- method1()");
	}

	@PostConstruct
	public void method2() {
		System.out.println("@PostConstruct- method2()");
	}

	public void method3() {
		System.out.println("init-method-> method3()");
	}

	public void method4() {
		System.out.println("destroy-method-> method4()");
	}

	public void show() {
		System.out.println("show()");
	}

}