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

### ch04
## for, swich, while, do-while문
        for (int i = 1; i < 6; i++) { //한줄에 12345출력
            System.out.print(i + " ");
        }

        System.out.println(" ");
        for (int x = 2; x < 11; x++) { //한줄에 1-10까지 짝수만 출력
            //x+=2
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }
        

        System.out.println(""); //(1)+(1+2)+(1+2+3)... 10까지 내가 한 방법
        int sum = 0; //sum=sum+ i *(11-i)
        int tot = 0;
        for (int x = 1; x < 11; x++) {
            sum += x;
            tot += sum;
        }

        int sum2; //(1)+(1+2)+(1+2+3)... 10까지 강사님 방법
        int tot2 = 0;
        for (int i = 1; i <= 10; i++) {
            sum2 = 0;
            for (int j = 1; j <= i; j++) {
                sum2 = sum2 + j;
            }
            tot2 += sum2;
        }
        System.out.println(tot2);

        int sum3 = 0; // 1+(-2)+3+(-4)... 100넘기면 출력
        for (int i = 1; i < 500; i++) {
            if (i % 2 == 0) {
                sum3 -= i; //num=-i;
            } else {
                sum3 += i; //num=i;
            }
            if (sum3 >= 100) {
                System.out.print(i);
                break;
            }
        }

        System.out.println("\n");
        for (int i = 1; i <= 5; i++) { //별찍기 5 5 5 5 5
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 1; i <= 5; i++) { //별찍기 1 2 3 4 5
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 1; i <= 5; i++) { //별찍기 5 4 3 2 1
            for (int j = 1; j <= (6 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        Scanner scan = new Scanner(System.in);
        /System.out.println("\n"); //스캔받아서 별 차례대로 찍기
        System.out.print("별 몇개 출력:");
        int s=scan.nextInt();
        for(int i=1;i<=s;i++){ 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n"); //스캔받아서 별 역순으로 찍기
        System.out.print("별 몇개 출력:");
        int c=scan.nextInt();
        for(int i=1;i<=c;i++){ 
            for(int j=1;j<=(c-1-i);j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=2;i<10;i++){ //구구단
            for(int j=1;j<10;j++){
                System.out.printf("%dX%d=%d",i,j,i*j);
                System.out.println();
            }
        }

        String str="1234"; //자릿수 뽑아서 더하기
        int sum6=0;
        for(int i=0;i<=str.length()-1;i++){
            int num=str.charAt(i)-'0'; //charAt은 char타입으로 문자열에서 인덱스에 해당하는 글자 추출. 바로 num에 정수로 들어감. 더해야하니까
            sum6+=num;
        }
        System.out.println(sum6);

        System.out.println();
        for (int i = 1; i <= 3; i++) { //111-333출력, 각 숫자가 1-3을 벗어나면 안됨
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    System.out.println("" + i + j + k); //printf("%d%d%d\n",i,j,k)
                }
            }
        }

        System.out.println();
        for (int i = 1; i <= 5; i++) { //[1,1] [2,2] [3,3] 출력
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    for (int t = 1; t <= i - 1; t++) {
                        System.out.print("\t");
                    }
                    System.out.printf("[%d,%d]", i, j);
                } //강사님=> 위에 for문 없애고 else {System.out.printf("    ")}
            }
            System.out.println();
        }

        System.out.println(); //while문으로 별 5줄 54321 찍어보기
        int a = 0;
        int b = 0;
        while (a < 5) {
            while (b < (5 - a)) {
                System.out.print("*");
                b++;
            }
            System.out.println();
            a++;
            b = 1;
        }
        
        System.out.println(); //1 증속 2 감속 3 중지 
        boolean run = true;
        int speed = 0;
        while (run) {
            System.out.println("----------------");
            System.out.println("1.증가 2.감속 3.중지");
            System.out.println("----------------");
            System.out.print("선택:");
            int choice = scan.nextInt();

            if (choice == 1) {
                speed++;
                System.out.println("현재속도:" + speed);
            } else if (choice == 2) {
                speed--;
                System.out.println("현재속도:" + speed);
            } else {
                run = false;
            }
        }
        System.out.println("프로그램 종료"); 

        System.out.println();
        double random = Math.random() * 101; //1~100 입력받아 랜덤난수 맞히기
        int r = (int) random;
        boolean run = true;
        System.out.println("1~100까지의 수 맞추기");
        int cnt = 0;

        while (run) { //do while로 하셨네, while(i!=r);이렇게만 쓰고 앞에 do는 너가 쓴거랑 똑같아
            System.out.print("숫자 입력: ");
            int i = scan.nextInt();

            if (i < r) {
                System.out.println("큰 수를 입력하세요.\n");
                cnt++;

            } else if (i > r) {
                System.out.println("작은 수를 입력하세요.\n");
                cnt++;
            } else {
                System.out.printf("정답입니다.오류 횟수: %d", cnt);
                run = false;

            }
        }
        System.out.println("\n프로그램 종료");

        
        do{
        input=scan.nextInt();
        if(input>com){
        작은수입력 출력
        cnt++;
        }

        else if(input<com){
        큰수입력 출력
        cnt++;
        } 만약 여기서 cnt++;를 하면 처음부터 정답일때도 cnt가 증가하니까 
        }while{input!=com};
        정답 출력
      