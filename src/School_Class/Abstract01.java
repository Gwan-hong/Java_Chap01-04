package School_Class;

public class Abstract01 {
        public static void main(String args[]) {
            System.out.println("==추상 메소드를 이용한 다형성==");
            Shape s = new Rectangle1();
            s.draw();
            s.computeArea(5.0, 10.0);
            s = new Triangle2();
            s.draw();
            s.computeArea(5.0, 10.0);
        }
    }


