package github.tiMorpheus.constructorDI.common;

import github.tiMorpheus.constructorDI.output.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        OutputHelper helper = (OutputHelper) context.getBean("OutputConstructorHelper");

        helper.generateOutput();
    }
}
