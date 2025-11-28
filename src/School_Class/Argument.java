package School_Class;

class Argument {
    public void change(int i, int j[]) {
        i = 20;
        j[3] = 400;
    }
    public void display(int i, int j[]) {
        System.out.println("객체 변수 i의 값 : " + i);
        System.out.print("배열의 값 : ");
        for(int value : j)
            System.out.print(value + " ");
        System.out.println();
    }
}
