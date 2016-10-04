package github.tiMorpheus.constructorDIwithManyArgs.output;

public class Customer {

    private String name;
    private String address;
    private int age;

    public Customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Customer(String address, int age, String name) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String toString(){
        return " name : " + name + "\n address : "
                + address + "\n age : " + age;
    }

}
