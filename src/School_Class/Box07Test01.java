package School_Class;

public class Box07Test01 {
    public static void main(String[] args) {
        Box07 mybox01 = new Box07();
        int vol = mybox01.height * mybox01.depth * mybox01.width;
        System.out.println("박스의 부피(매개 변수 없음) : " + vol);

        mybox01 = new Box07(10);
        vol = mybox01.height * mybox01.depth * mybox01.width;
        System.out.println("박스의 부피(매개 변수 1개) : " + vol);

        mybox01 = new Box07(10, 20);
        vol = mybox01.height * mybox01.depth * mybox01.width;
        System.out.println("박스의 부피(매개 변수 2개) : " + vol);

        mybox01 = new Box07(10, 20, 30);
        vol = mybox01.height * mybox01.depth * mybox01.width;
        System.out.println("박스의 부피(매개 변수 3개) : " + vol);


    }
}
