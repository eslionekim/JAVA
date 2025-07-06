package ch02;

public class variableExchange {

    public static void main(String[] args) { //숫자 바꾸기
        int x=3;
        int y=5;

        System.out.printf("원래는 x=%d, y=%d입니다.\n",x,y);

        int box=x;
        x=y;
        y=box;

        System.out.printf("바꾼값은 x=%d, y=%d 입니다",x,y);
    }
}
