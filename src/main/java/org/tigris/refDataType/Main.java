package org.tigris.refDataType;

public class Main {

    public static void main(String[] args) {

        int num = 10; //primitive variable
        modifyPrimitive(num);
        System.out.println(num); //did not change

        //reference data type
        Person person =new Person();
        person.name= "person1";
        modifyReference(person);
        System.out.println(person.name); //changed because it is a reference if you want to change it you have to give object
        modifyReferenceWithObject(person);
        System.out.println(person.name); //still person2 not person3

        //primitive data store in stack
        //reference store in heap  reference point value store in stack

    }

    private static void modifyReferenceWithObject(Person person) {
      person=new Person();
      person.name="person3";

    }

    private static void modifyReference(Person person) {
        person.name="person2";
    }

    private static void modifyPrimitive(int num) {
        num = 20;
    }
}


//refrenced data type

class  Person {
    String name;

}