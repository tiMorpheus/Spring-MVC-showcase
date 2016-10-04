package github.tiMorpheus.constructorDIwithManyArgs.common;

import github.tiMorpheus.constructorDIwithManyArgs.output.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                                        new String[]{"Spring-customer.xml"});

        Customer customer = (Customer) context.getBean("CustomerBean");

        System.out.println(customer);
    }
}
