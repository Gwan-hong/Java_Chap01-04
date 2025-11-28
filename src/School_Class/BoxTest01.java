package School_Class;

public class BoxTest01 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1();
        Box1 box2 = new Box1();
        int vol1, vol2;

        mybox1.width = 78;
        mybox1.height = 145;
        mybox1.depth = 87;

        box2.width = 48;
        box2.height = 45;
        box2.depth = 137;
        
        vol1 = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("첫 번째 박스의 부피는 " + vol1 + "입니다.");

        vol2 = box2.width * box2.height * box2.depth;
        System.out.println("두 번째 박스의 부피는 " + vol2 + "입니다.");
    }
}
