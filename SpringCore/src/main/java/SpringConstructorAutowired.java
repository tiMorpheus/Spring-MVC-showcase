import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Constructor DI injection Hello World using Java annotation
 */
public class SpringConstructorAutowired {
    public static class Notifier{
    private final NotificationService service;

        @Autowired
        public Notifier(NotificationService service) {
            this.service = service;
        }

        public void send(String message){
            service.send("Email: " + message);
        }
    }
    interface NotificationService {
        void send(String message);
    }
    public static class EMailService implements NotificationService {
        @Override
        public void send(String message) {
            System.out.println("I send " + message);
        }
    }

    @Configuration
    public static class DIConfiguration{
        @Bean
        public Notifier getNotificatier(NotificationService service){
            return new Notifier(service);
        }

        @Bean
        public NotificationService getNotificationService(){
            return new EMailService();
        }


    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        Notifier notifier = context.getBean(Notifier.class);
        notifier.send("Hello World!!!");

    }
}
