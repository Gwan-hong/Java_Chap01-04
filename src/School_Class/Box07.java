package School_Class;

import javax.swing.*;

class Box07 {
    int width;
    int height;
    int depth;
    public Box07(){
        this(1, 1, 1);
        System.out.println("매개 변수 없는 생성자 수행");

    }

    public Box07(int width) {
        this(width, 1, 1);
        System.out.println("매개 변수(1개) 생성자 수행");

    }

    public Box07(int width, int height) {
        this(width, height, 1);
        System.out.println("매개 변수(2개) 생성자 수행");

    }

    public Box07(int width, int height, int depth) {
        System.out.println("매개변수 (3개) 생성자 수행");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
