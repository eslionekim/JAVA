package ch02;

public class stringCal {
    public static void main(String[] args) { //문자가 맨 뒤에 나오거나 뒤에 ()가 있는걸 제외하면 다 글자 더하기
        int i=1+2+8; //11
        System.out.println("int i=1+2+8="+i); 

        String s="1"+2+8; //128
        System.out.println("String s=\"1\"+2+8="+s);

        String s2="1"+"2"+8; //128
        System.out.println("String s2=\"1\"+\"2\"+8="+s);

        String s3="1"+(2+8); //110
        System.out.println("String s3=\"1\"+(2+8)="+s3);

    }
}
