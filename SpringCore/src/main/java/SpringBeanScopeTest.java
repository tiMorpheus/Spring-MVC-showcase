import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

public class SpringBeanScopeTest {

    @Configuration
    public static class TestConfiguration{

        // 4 method for Singleton definitions
        @Bean
        @Scope("singleton")
        public SingletonClass1 getSingletonClass1(){
            return new SingletonClass1();
        }

        @Bean
        @Scope(BeanDefinition.SCOPE_SINGLETON)
        public SingletonClass2 getSingletonClass2(){
            return new SingletonClass2();
        }

        @Bean
        @Scope
        public SingletonClass3 getSingletonClass3(){
            return new SingletonClass3();
        }

        @Bean            // по умолчанию Spring создает Singleton
        public SingletonClass4 getSingletonClass4(){
            return new SingletonClass4();
        }


        // 3 method for PROTOTYPE definitions

        @Bean
        @Scope(BeanDefinition.SCOPE_PROTOTYPE)
        public PrototypeClass1 getPrototypeClass1(){
            return new PrototypeClass1();
        }

        @Bean
        @Scope("prototype")
        public PrototypeClass2 getPrototypeClass2(){
            return new PrototypeClass2();
        }

        @Bean
        @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
        public PrototypeClass3 getPrototypeClass3(){
            return new PrototypeClass3();
        }

        @Bean
        public BeanForTestScope1 getBeanForTestScope1(){
            return new BeanForTestScope1();
        }
        @Bean
        public BeanForTestScope2 getBeanForTestScope2(){
            return new BeanForTestScope2();
        }
    }

    @Service
    public static class SingletonClass1{

        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }


    @Service
    public static class SingletonClass2{
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    @Service
    public static class SingletonClass3{
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    @Service
    public static class SingletonClass4{
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    @Service
    public static class PrototypeClass1{
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    @Service
    public static class PrototypeClass2{
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    @Service
    public static class PrototypeClass3{
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static class BeanForTestScope1{
        @Autowired
        private SingletonClass1 singletonClass1;
        @Autowired
        private SingletonClass2 singletonClass2;
        @Autowired
        private SingletonClass3 singletonClass3;
        @Autowired
        private SingletonClass4 singletonClass4;
        @Autowired
        private PrototypeClass1 prototypeClass1;
        @Autowired
        private PrototypeClass2 prototypeClass2;
        @Autowired
        private PrototypeClass3 prototypeClass3;

        public void setValue(int value){
            singletonClass1.setValue(value);
            singletonClass2.setValue(value);
            singletonClass3.setValue(value);
            singletonClass4.setValue(value);
            prototypeClass1.setValue(value);
            prototypeClass2.setValue(value);
            prototypeClass3.setValue(value);
        }
        public void printValue(){
            System.out.println();
            System.out.println("BeanForTestScope1");
            System.out.println("Singleton1: " + singletonClass1.getValue());
            System.out.println("Singleton2: " + singletonClass2.getValue());
            System.out.println("Singleton3: " + singletonClass3.getValue());
            System.out.println("Singleton4: " + singletonClass4.getValue());
            System.out.println("Prototype1: "+ prototypeClass1.getValue());
            System.out.println("Prototype2: "+ prototypeClass2.getValue());
            System.out.println("Prototype3: "+ prototypeClass3.getValue());
        }
    }

    public static class BeanForTestScope2{
        @Autowired
        private SingletonClass1 singletonClass1;
        @Autowired
        private SingletonClass1 singletonClass2;
        @Autowired
        private SingletonClass1 singletonClass3;
        @Autowired
        private SingletonClass1 singletonClass4;
        @Autowired
        private PrototypeClass1 prototypeClass1;
        @Autowired
        private PrototypeClass1 prototypeClass2;
        @Autowired
        private PrototypeClass1 prototypeClass3;

        public void setValue(int value){

            singletonClass1.setValue(value);
            singletonClass2.setValue(value);
            singletonClass3.setValue(value);
            singletonClass4.setValue(value);
            prototypeClass1.setValue(value);
            prototypeClass2.setValue(value);
            prototypeClass3.setValue(value);

        }
        public void printValue(){
            System.out.println();
            System.out.println("BeanForTestScope2");
            System.out.println("Singleton1: " + singletonClass1.getValue());
            System.out.println("Singleton2: " + singletonClass2.getValue());
            System.out.println("Singleton3: " + singletonClass3.getValue());
            System.out.println("Singleton4: " + singletonClass4.getValue());
            System.out.println("Prototype1: "+ prototypeClass1.getValue());
            System.out.println("Prototype2: "+ prototypeClass2.getValue());
            System.out.println("Prototype3: "+ prototypeClass3.getValue());
        }
    }


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TestConfiguration.class);


        // BeanForTestScope - static inner class
        BeanForTestScope1 beanForTestScope1 = context.getBean(BeanForTestScope1.class);
        BeanForTestScope2 beanForTestScope2 = context.getBean(BeanForTestScope2.class);

        beanForTestScope1.setValue(1);
        beanForTestScope2.setValue(2);
        beanForTestScope1.printValue();   // Singleton print 2  , prototype 1
        beanForTestScope2.printValue();   //  singleton 2 , prototype 2
        beanForTestScope1.setValue(4);
        beanForTestScope1.printValue();   // singleton 4 prototype 4;

    }






}
