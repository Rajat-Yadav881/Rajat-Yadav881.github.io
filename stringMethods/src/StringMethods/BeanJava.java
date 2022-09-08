package StringMethods;

import java.util.Scanner;

public class BeanJava {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter your name");
//        String name = scanner.next();
//        System.out.println("enter your age");
//        int age = scanner.nextInt();
//        System.out.println(name+" "+age);
//        scanner.close();
        Person person = new Person();
        person.name = "rajat";
        person.city = "mau";
        person.zip = "343552";

        Office office = new Office();
        office.companyName = "MasaiSchool";
        //creating address
        Address masaiAddress = new Address();
        masaiAddress.city = "BLR";
        masaiAddress.zip = "232434";
        //assign the address to the office
        office.address = masaiAddress;
        System.out.println(office.companyName);
        System.out.println(office.address.city);
    }

}
class Person{
    String name;
    String city;
    String zip;
}
 class Address{

        String city;
        String zip;

    }
class Office{
    String companyName;
    Address address;//composition dataType//one object is nested in other object
//static inner class it resticts the reuse of the address class
//   static class Address{
//
//        String city;
//        String zip;
//
//    }
}