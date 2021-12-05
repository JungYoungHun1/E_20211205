package Exam03;

public class Animal {
    String name;
    int age;

    void sound(){
        System.out.println("Animal sound");
    }

    void call(Animal animal){
        sound();
    }
}
