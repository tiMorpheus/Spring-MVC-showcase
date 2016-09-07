package xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  Field DI injection Hello World using XML config
 */
public class XmlFieldAutowired {
    public static class Notifier{
        @Autowired
        private NotificationService service;

        public void setService(NotificationService service) {
            this.service = service;
        }

        public void send(String message){
            service.send("email: "+ message);
        }

    }
    public static class EMailService implements NotificationService{

        public void send(String message) {
            System.out.println("I send "+ message);
        }
    }
    interface NotificationService{
        void send(String message);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("fieldAutowired.xml");
        Notifier notifier = context.getBean(Notifier.class);
        notifier.send("Hello world!!!");
    }
}
