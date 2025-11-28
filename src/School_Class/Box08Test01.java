package School_Class;

import javax.swing.*;

public class Box08Test01 {
    public static void main(String[] args) {
        Box08 mybox01 = new Box08(10, 20, 30);
        //mybox01.width = 20;
        int vol = mybox01.volume();
        System.out.println("정수 박스의 부피 : " + vol);

    }
}
