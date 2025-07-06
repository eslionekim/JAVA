import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("주민등록번호를 000000-0000000 형태로 입력하시오.:");  
        String code=scan.nextLine();
        

        if(code.length()==14){
            char jender = code.charAt(7);
            switch(jender){
                case '1','3':
                    System.out.println("남자입니다.");
                    break;
                case '4','2':
                    System.out.println("여자입니다.");
                    break;
                default:
                    System.out.println("제대로 입력하세요.");
                }        
            }
            else{
                System.out.println("제대로 입력하세요.");
            }
    }
}