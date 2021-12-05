package exam06;

import java.util.ArrayList;

public class DogList {
    public static void main(String[] args) {
        ArrayList<Dog> list = new ArrayList<>();
        Dog dog1 = new Dog();
        dog1.setName("dog1");
        dog1.setAge(1);
        Dog dog2 = new Dog();
        dog2.setName("dog2");
        dog2.setAge(2);
        Dog dog3 = new Dog();
        dog3.setName("dog3");
        dog3.setAge(3);
        list.add(dog1);
        list.add(dog2);
        list.add(dog3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
