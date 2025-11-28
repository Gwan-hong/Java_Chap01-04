package School_Class;

public class Box11Test1 {
    public static void main(String[] args) {
        Box11 mybox01 = new Box11(10, 20, 30);
        System.out.println("박스의 부피(정수 매개 변수) : " + mybox01.get_ivol());

        mybox01 = new Box11(10.5, 20.5, 30.5);
        System.out.println("박스의 부피(실수 매개 변수) : " + mybox01.get_dvol());

        mybox01 = new Box11(10, 20, 30.5);
        System.out.println("박스의 부피(정수와 실수 혼합) : " + mybox01.get_dvol());

    }
}
