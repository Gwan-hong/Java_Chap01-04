package School_Class;

import java.util.Scanner;

public class BreakTest01 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("합계를 원하는 정수 입력 :");
        int sum = 0, i = 1;
        while (true) {
            sum = sum + i;
            if (i == sum) break;
            i++;
        }
        System.out.println(sum + "까지의 합계는 = " + sum);

    }
}
