package exam02;

public class Person {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(){}
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void walk(){
        System.out.println("걷다");
    }
    public void run(int speed){
        System.out.println(speed+"km/h로 달리다");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
