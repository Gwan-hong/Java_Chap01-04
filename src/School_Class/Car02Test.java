package School_Class;

import java.util.Scanner;

public class Car02Test {
    public static void main(String[] args) {
        String color;
        int cc, fuel;
        System.out.print("구입하고 싶은 차의 배기량은(1:2000cc이하 2:2000cc이상):");
        Scanner stdin = new Scanner(System.in);
        cc = stdin.nextInt();
        System.out.print("구입하고 싶은 차의 연료는(1:가솔린 2:디젤) :");
        stdin = new Scanner(System.in);
        fuel = stdin.nextInt();
        System.out.print("구입하고 싶은 차의 컬러는 :");
        stdin = new Scanner(System.in);
        color = stdin.next();
        Car02 c = new Car02(color, cc, fuel);
        System.out.println(c.getPrice());
        System.out.println("차량의 가격은 : " + c.e.getPrice());

    }
}
