package github.tiMorpheus.setterDI.commo;

import github.tiMorpheus.setterDI.output.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

        OutputHelper helper = (OutputHelper) context.getBean("OutputHelper");

        helper.generateOutput();
    }
}
