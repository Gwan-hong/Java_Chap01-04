package School_Class;

import javax.swing.*;

public class Box06Test01 {
    public static void main(String[] args) {
        Box06 mybox01 = new Box06(10, 20, 30);
        int vol = mybox01.width * mybox01.height * mybox01.depth;
        System.out.println("박스의 부피(정수 매개 변수) : " + vol);
        mybox01 = new Box06(10.5, 20.5, 30.5);
        double dvol = mybox01.dwidth * mybox01.dheight * mybox01.ddepth;
        System.out.println("박스의 부피(정수와 실수 혼합) : " + dvol);
    }
}
