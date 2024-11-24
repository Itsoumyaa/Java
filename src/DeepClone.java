import java.util.*;
class Address implements Cloneable{
    private String state;
    private String city;
    public Address(String city, String state){
        this.city=city;
        this.state=state;
    }
    //getters and setters
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state=state;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String toString(){
        return "Address{city='"+ city + "', state='"+ state+ "'}";
    }
}
class Person implements Cloneable{
    private String name;
    private Address address;
    public Person(String name, Address address){
        this.name=name;
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    protected Object clone() throws CloneNotSupportedException{
        Person cloned=(Person) super.clone();
        cloned.address=(Address) address.clone();
        return cloned;
    }
    public String toString(){
        return "Person{name='"+ name + "', address=" + address+ "}";
    }
}
public class DeepClone {
    public static void main(String[] args) {
        try{
            Address address=new Address("Greece","Athens");
            Person p1= new Person("Robert",address);

            Person p2=(Person) p1.clone();
            p2.getAddress().setCity("Italy");
            p2.setName("Jimin");
            System.out.println("original: "+p1);
            System.out.println("clone: "+p2);
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
