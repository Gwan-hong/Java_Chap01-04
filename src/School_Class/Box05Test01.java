package School_Class;

public class Box05Test01 {
    public static void main(String[] args) {
        Box05 mybox5 = new Box05();
        int vol = mybox5.width * mybox5.height * mybox5.depth;
        System.out.println("박스의 부피(매개 변수 없음) : " + vol);

        mybox5 = new Box05(10);
        vol = mybox5.width * mybox5.height * mybox5.depth;
        System.out.println("박스의 부피(매개 변수 1개) : " + vol);

        mybox5 = new Box05(10, 20);
        vol = mybox5.width * mybox5.height * mybox5.depth;
        System.out.println("박스의 부피(매개 변수 2개) : " + vol);

        mybox5 = new Box05(10, 20, 30);
        vol = mybox5.width * mybox5.height * mybox5.depth;
        System.out.println("박스의 부피(매개 변수 3개) : " + vol);

    }
}
