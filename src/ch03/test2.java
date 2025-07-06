package ch03;

import java.util.Scanner;

public class test2 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("100의 자리 숫자를 입력하세요.:");
        int i = scan.nextInt();

        System.out.printf("100의 자릿수는 %d, 10의 자릿수는 %d, 1의 자릿수는 %d입니다.", i / 100, (i % 100) / 10, i % 10);
        scan.close();
    }
}
