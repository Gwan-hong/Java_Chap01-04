package School_Class;

public class Box04Test01 {
    public static void main(String[] args) {
        Box04 mybox01 = new Box04(10, 20, 30);
        //Box04 mybox2 = new Box04();
        int vol = mybox01.width * mybox01.height * mybox01.depth;
        System.out.println("박스의 부피 : " + vol);

    }
}
