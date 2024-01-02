package com.example;
public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Martin");
        person.setLastName("Blue");
        person.setAge(30);


        System.out.println("Person details:");
        System.out.println(person.toString());

        Person anotherPerson = new Person();
        anotherPerson.setFirstName("John");
        anotherPerson.setLastName("Doe");
        anotherPerson.setAge(30);

        System.out.println("\nEquals check:");
        System.out.println("Are persons equal? " + person.equals(anotherPerson));

        // Тестирование сериализации в JSON
        String json = person.toJson();
        System.out.println("\nJSON representation:");
        System.out.println(json);

        // Тестирование десериализации из JSON
        Person deserializedPerson = Person.fromJson(json);
        System.out.println("\nDeserialized Person:");
        System.out.println(deserializedPerson.toString());
    }
}
