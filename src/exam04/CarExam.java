package exam04;

public class CarExam {
    public static void main(String[] args) {
//        Car car = new Car(); 추상 클래스 객체 생성 불가
        Car taxi = new Taxi();
        Car bus = new Bus();

        taxi.drive();
        bus.drive();
    }
}
