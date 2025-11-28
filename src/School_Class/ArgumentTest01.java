package School_Class;

class ArgumentTest01 {
    public static void main(String args[]) {
        Argument d = new Argument();
        int a = 10;
        int b[]  = { 1, 2, 3, 4 };
        System.out.println("첫 번째 display() 메소드 호출");
        d.display(a, b);
        d.change(a, b);
        System.out.println("=============================");
        System.out.println("값을 변환한 다음 두 번째 display() 호출");
        d.display(a, b);
    }
}