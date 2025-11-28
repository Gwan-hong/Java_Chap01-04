package School_Class;

public class Box2Test1 {
    public static void main(String[] args) {
        int it1 = 100;
        int it2 = it1;
        System.out.println("첫 번째 값 : " + it1 + "두 번째 값 : " + it2);
        it1 = 200;
        System.out.println("첫 번째 값 : " + it1 + "두 번째 값 : " + it2);
        Box2 box1 = new Box2();
        Box2 mybox2 = new Box2();
        box1.width = 20;
        mybox2.depth = 123;
        System.out.println("box1.width : " + box1.width);
        System.out.println("box1.height : " + box1.height);
        System.out.println("box1.depth : " + box1.depth);

        System.out.println("box2.width : " + mybox2.width);
        System.out.println("box2.height : " + mybox2.height);
        System.out.println("box2.depth : " + mybox2.depth);

        Box2 mbox3 = mybox2;
        mybox2.width = 1000;
        mybox2.height = 2000;

        System.out.println("box3.width : " + mbox3.width);
        System.out.println("box3.height : " + mbox3.height);
        System.out.println("box3.depth : " + mbox3.depth);

    }
}
