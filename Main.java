/**
 * Created by Damitha on 3/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        Person person =new Person();
        person.setName("Darshana");
        person.setEmail("ihateIntelliJ@gmail.com");
        System.out.println(savePerson(person));
    }

    public static Person savePerson(Person perr){
        if(perr==null){
            throw new IllegalArgumentException();
        }
        else{
            perr.setId("p100");
            return perr;
        }
    }
}
