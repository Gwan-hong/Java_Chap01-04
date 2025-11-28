package School_Class;

public class Box003Test1 {
    public static void main(String[] args) {
        Box003 box001 = new Box003();
        Box003 box002 = new Box003();
        Box003 box003 = new Box003();
        Box003 box004 = new Box003();

        System.out.println("box001의 id번호 : " + box001.idNum);
        System.out.println("box002의 id번호 : " + box002.idNum);
        System.out.println("box003의 id번호 : " + box003.idNum);
        System.out.println("box004의 id번호 : " + box004.idNum);
        System.out.println("마지막 생성된 박스 번호는 " + Box003.boxID + "번 입니다.");

    }
}
