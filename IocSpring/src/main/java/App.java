import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class App {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("E:\\PROJECTSjava\\SpringHelloWorld\\IocSpring\\src\\main\\resources\\sample-beans.xml"));
        HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");

        helloWorld.sayMassage();
    }
}
