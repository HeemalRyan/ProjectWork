package org.Heemal.Ryan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Store {

	public static void main(String[] args) {
		//PaintSection paintsection = new PaintSection();  // Not Using Spring Framework
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); // Using BeanFactory
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // Using Application Context 
				
		PaintSection paintsection = (PaintSection) context.getBean("paintsection");
		paintsection.getPaint();
	}

}
