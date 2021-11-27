package example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TextUser {

	public static void main(String[] args) {

		Resource res = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		UserDAO udao = (UserDAO) factory.getBean("userDAO");
		int result = udao.saveUser(new User(1, "sumit", "admin"));
		System.out.println(result);
	}

}
