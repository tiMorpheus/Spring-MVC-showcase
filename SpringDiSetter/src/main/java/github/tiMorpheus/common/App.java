package github.tiMorpheus.common;

import github.tiMorpheus.output.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
        output.generateOutput();

    }
}
