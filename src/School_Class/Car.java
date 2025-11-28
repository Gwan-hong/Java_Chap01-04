package School_Class;

public class Car {
    int speed;
    String model;

    public Car(String model){
        this.model = model;
        this.speed = 0;
    }

    public void speedUp(int value) {
        speed += value;
    }

    public void speedDown(int value) {
        speed -= value;
        if (speed < 0) speed = 0;
    }

    public void showStatus() {
        System.out.println("자동차 모델 : " + model + ", 현재 속도 : " + speed + " km/h ");
    }
}


