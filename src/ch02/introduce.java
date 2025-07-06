package ch02;
import java.util.Scanner;

public class introduce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //스캐너 스캐너이름 = 스캐너를 메모리에 넣기(시스템내부)
        
        System.out.print("이름을 입력하세요.:");
        String name=scan.nextLine();

        System.out.print("나이를 입력하세요.:");
        String age=scan.nextLine();
        int ageInt=Integer.parseInt(age);

        System.out.print("학과를 입력하세요.:");
        String major=scan.nextLine();

        System.out.printf("제 이름은 "+name+" 이고, 나이는 %d살이며, 학과는 %s 입니다.",ageInt,major);
    }
}
