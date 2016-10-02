public class HelloWorldImpl implements HelloWorld {
    private String myMessage;

    public void setMessage(String message){
        myMessage = message;
    }

    public void sayMassage() {
        System.out.println("Hello world!!! Hello "+ myMessage + "!");
    }
}
