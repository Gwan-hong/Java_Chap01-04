package School_Class;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Sonata");

        car1.showStatus();
        car1.speedUp(140);
        car1.showStatus();
        car1.speedDown(70);
        car1.showStatus();
    }
}
