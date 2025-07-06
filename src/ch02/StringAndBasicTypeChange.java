package ch02;

public class StringAndBasicTypeChange {
    public static void main(String[] args) {
        String s="10";

        int i=Integer.parseInt(s); //문자열을 int로
        System.out.println("int i=Integer.parseInt(s)="+i);

        double d=Double.parseDouble(s); //문자열을 double로
        System.out.println("double d=Double.parseDouble(s)="+d);

        System.out.println("String.valueOf(d)="+String.valueOf(d)); //double을 문자열로

    }
}
