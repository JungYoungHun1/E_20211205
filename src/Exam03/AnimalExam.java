package Exam03;

public class AnimalExam {
    public static void main(String[] args) {
        Animal dog = new Dog(); //speed에는 접근 불가 오버라이딩 메소드만 접근 가능
        Animal horse = new Horse();
        Animal tiger = new Tiger();

        dog.call(dog);
        horse.call(horse);
        tiger.call(tiger);
    }
}
