package School_Class;

public class CastTest02 {
    public static void main(String[] args) {
        Rectangle05 r = new Cube05(10, 20, 30);
        System.out.println("정사각형의 넓이는 :" + r.computeRectangleArea());
        //System.out.println("넓이는 :" + r.computeCubeArea());
        Cube05 c = (Cube05) r;
        System.out.println("직육면체의 부피는 :" + r.computeRectangleArea());

    }
}
