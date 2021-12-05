package exam05;

public class SuperCar extends Car implements DriveEnable, StopEnable{

    @Override
    public void drive() {
        System.out.println("Super Car run");
    }

    @Override
    public void stop() {

    }
}
