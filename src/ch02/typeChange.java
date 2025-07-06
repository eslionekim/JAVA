package ch02;

public class typeChange {
        public static void main(String[] args) {
            //int와 double연산
            int i=1;
            double d=3.56;
            double result=i+d; //int와 double계산이니까 더 허용범위의 double
            System.out.println("int+double="+result);

            int result2=i+(int)d; //소수점 버리고 싶으면 double을 int로 강제 타입 변환
            System.out.println("int+(int)double="+result2);

            int x=2;
            int y=3;
            double db=x/y; //2/3=0.5이지만 int끼리 연산이니까 0이 돼. 그럼 double타입이니 0.0이겠지
            System.out.println("x/y(int)="+db);

            char c1='A';
            char c2=1;
            int result3=c1+c2; //둘다 int로 변환되어 계산되니 65+1=66
            System.out.println("c1+c2="+result3);
            System.out.println("c1+c2->char="+(char)result3);
        }
}
