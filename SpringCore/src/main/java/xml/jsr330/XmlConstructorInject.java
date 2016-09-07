package xml.jsr330;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.inject.Inject;

/**
 * Hello World using jsr330 annotation and XML config
 */
public class XmlConstructorInject {
    public static class Notifier{
        private NotificationService service;

        @Inject
        public Notifier(NotificationService service) {
            this.service = service;
        }
        public void send(String message){
            service.send("Email: " + message);
        }
    }

    public interface NotificationService{
        void send(String message);
    }


    public static class EMailService implements NotificationService{

        public void send(String message) {
            System.out.println("I send " + message);
        }
    }



    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("constructorInject.xml");
        Notifier notifier = context.getBean(Notifier.class);
        notifier.send("Hello World!!!"); // print: "I send Email: Hello World!!!"
    }

}
