/*
[문제1] main()함수에서 각각 호출하고 계산된 결과를 return 받아서 
          main()에서 출력하시오
파일명:Test1.java
호출함수 : sum(3,5):int   sub(7,2):int   mul(4,5):int   div(7,3):double

더하기 : 8
빼  기 : 5
곱하기 : 20
나누기 : 2.33
------------------------------------------------------------------
[문제2] main()함수에서 메서드를 호출하여 다음과 같이 출력하시오

(조건)
1. 함수명 : output(10,'#'):void
2. 출력문에서 for문을 이용하시오

<결과>
# # # # # # # # # # 
------------------------------------------------------------------
[문제3]값을 입력받아 함수호출하여 처리하시오
조건1)입력받은 값을  compute(item, qty, price):void  함수에서 처리
조건2)계산방법 : 금액 = 수량 * 단가

-입력-
품명 : apple
수량 : 10
단가 : 1200

-출력-
품명 : apple
금액 : 12000원
----------------------------------------------------
[문제4] 아래와 같이 12달의 날수를 배열를 만들어 기억시킨후 
원하는 month을 입력받아 그 달의 날수를 출력하시오

[참고]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

--입력화면/출력화면--

원하는 month을 입력하시오 : 3
3월은 31일입니다.

[문제5]다음을 수정/완성하시오
(1)클래스명:Test5
     필드명 : -base:double  (초기값:5.0)
                -height:double (초기값:3.5)
     메서드명: +getArea():double
                  +getHypotenuse():double 
                  +getPerimeter():double
(2)조건
   1)공  식 : 삼각형의 넓이 = (밑변 * 높이) /2
                빗변길이 = Math.sqrt(밑변*밑변+높이*높이)  
                둘레길이 = 밑변 + 높이 + 빗변길이 
   2) Test5로 객체 ob를 생성한다
   3) getArea()는 삼각형의 넓이를 리턴한다
       getHypotenuse() 빗변의 길이를 리턴한다
       getPerimeter()는 둘레길이를 리턴한다 

[출력화면]
삼각형의넓이 : 8.75
빗변길이 : 6.10
둘레길이 : 14.60
--------------------------------------------------------------------
[문제6]함수 overloading을 이용하여 다음을 완성하시오
(1)클래스명:Test6
    ① 필드명 : PI:double     (초기값:3.141593, final로 선언)
    ② 메소드 : 
           area(a:int):double       => 원의넓이=반지름*반지름*PI
           area(a:int, b:int):double     => 사각형의넓이=가로*세로
           area(a:int, b:int, c:int):doble     => 사다리꼴의 넓이=(밑변 + 윗변 )*높이/2 
(2)조건
     1)main()함수에서 
       public static void  main(String[] args){
             Test6 ob=new Test6();
             //나머지 완성하시오
       }
     2)각각의 area(3),area(4,5),area(3,4,7) 메서드를 호출하여 
        결과값을 구한다

[결과화면]
원의넓이 : 28.274337
사각형의넓이 : 20.0
사다리꼴의넓이 : 24.5
--------------------------------------------------------------------
[문제7]다중클래스를 만들고 setter & getter를 이용하여 다음을 완성하시오
(1)클래스명:  BookShop
    필드명 : -name:String   (책이름)
                -author:String   (저자) 
                -price:int          (가격) 
    메서드명 : +setBook(bname:String,  author:String, price:int):void
                   +viewBook():void
                   +setter & getter
(2)조건
    1) Test7클래스의 main()메서드에서 BookShop 클래스로 객체 ob를 만든다
    2) setBook("자바완성","홍길동",25000)로 값을 대입한후 viewBook()메서드로 출력한다
    3)  setName("JSP잡기"),  setAuthor("이순신"), setPrice(3500)로 값을 대입한후
         getName(), getAuthor(), getPrice()로 출력한다

[출력화면]
책이름 : 자바완성
저  자 : 홍길동
가  격 : 25000원

책이름 : JSP잡기
저  자 : 이순신
가  격 : 35000원
*/
public class Test1 {
	public static void main(String[] args) {
		
		/*
		호출함수 : sum(3,5):int   sub(7,2):int   mul(4,5):int   div(7,3):double

		더하기 : 8
		빼  기 : 5
		곱하기 : 20
		나누기 : 2.33
		*/
		
		System.out.println("더하기 : "+sum(3,5));
		System.out.println("빼기 : "+sub(7,2));
		System.out.println("곱하기 : "+mul(4,5));
		System.out.printf("나누기 : %.2f",div(7,3));
		
		
	}
	
	public static int sum(int x, int y){
		return x+y;
	}
	public static int sub(int x, int y){
		return x-y;
	}
	public static int mul(int x, int y){
		return x*y;
	}
	public static double div(int x, int y){
		return (double)x/y;
	}
}
