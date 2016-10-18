package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"Bean.xml"});

        CustomerService service = (CustomerService) context.getBean("AAA");

        System.out.println(service);
    }
}
