### ch02.변수
## variableExchange : 변수 데이터 바꾸기
        int x=3;
        int y=5;

        System.out.printf("원래는 x=%d, y=%d입니다.\n",x,y);

        int box=x;
        x=y;
        y=box;

        System.out.printf("바꾼값은 x=%d, y=%d 입니다",x,y);

## typeChange : 다른 타입끼리 연산 
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

## variableExchange : 문자열 더하기 
        int i=1+2+8; //11
        System.out.println("int i=1+2+8="+i); 

        String s="1"+2+8; //128
        System.out.println("String s=\"1\"+2+8="+s);

        String s2="1"+"2"+8; //128
        System.out.println("String s2=\"1\"+\"2\"+8="+s);

        String s3="1"+(2+8); //110
        System.out.println("String s3=\"1\"+(2+8)="+s3);

## StringAndBasicTypeChange : 문자열과 기본 타입을 변환
        String s="10";

        int i=Integer.parseInt(s); //문자열을 int로
        System.out.println("int i=Integer.parseInt(s)="+i);

        double d=Double.parseDouble(s); //문자열을 double로
        System.out.println("double d=Double.parseDouble(s)="+d);

        System.out.println("String.valueOf(d)="+String.valueOf(d)); //double을 문자열로

## introduce : 자기 소개
        Scanner scan = new Scanner(System.in); //스캐너 스캐너이름 = 스캐너를 메모리에 넣기(시스템내부)
        
        System.out.print("이름을 입력하세요.:");
        String name=scan.nextLine();

        System.out.print("나이를 입력하세요.:");
        String age=scan.nextLine();
        int ageInt=Integer.parseInt(age);

        System.out.print("학과를 입력하세요.:");
        String major=scan.nextLine();

        System.out.printf("제 이름은 "+name+" 이고, 나이는 %d살이며, 학과는 %s 입니다.",ageInt,major);

