package School_Class;

public class Box10Test01 {
    public static void main(String[] args) {
        Box10 mybox01;
        for (int i = 1; i <= 5; i++) {
            mybox01 = new Box10(i, i + 1, i + 2);
            System.out.println(mybox01.getvolume());

        }
        System.out.println("마지막 생성된 박스 번호는 " + Box10.getCurrentID() + "번입니다.");
        //System.out.println(Box10.boxID);
    }
}
