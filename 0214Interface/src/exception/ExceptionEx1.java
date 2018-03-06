package exception;
//예외처리는 해결하는 것이 아니라 버리는 것.
/*
24. 예외처리 
: 비교적 가벼운 에러로 에러 발생할것을 미리예측하여 처리하는것
 1. Unchecked Exception : 필요한 경우 예외처리수행
      - ArithmeticException, NullPointException, ArrayIndexOutOfBoundsException
 2. Checked Exception : 강제로 예외처리를 수행
      - IOException,FileNotFoundException

① throws 예약어 : 예외객체를 양도
<--- 예외상황을 다음 문장으로 전가
② try{   }catch{   } : 예외가 발생하면 예외객체를 잡아내어 원하는 동작을 수행
<-- 예외상황을 처리하고 다음문장 수행
③ try{   }catch{   }finally{   } : 예외가 발생하든 안하든 finally는 무조건수행
       [참고] return 을 해도 finally는 수행
④ throw  : 예외강제발생 - 실제 업무에서는 자주 쓰인다.

Exception :  모든 예외상황
IOException : 입.출력에 관련된 예외
NumberFormatException : 숫자가 아닌 문자가 입력되는 예외
ArithmeticException : 0으로나누는 예외
ArrayIndexOutOfBoundsException : 배열초과
======================================================
*/
/*
2-->2
0-->0으로 나눌수 없음
a-->숫자로 바꿀 수 없음
 -->입력이 없음.
*/
public class ExceptionEx1 {
	public static void main(String[] args) {
		int val = 5;
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(val/n);
		} catch (Exception e){
			System.out.println("안돼!");
		}
		/*catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("0으로 나눌 수 없음");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("숫자로 바꿀 수 없음");
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("입력 값이 없음");
		} finally {
			System.out.println("*** 무조건 실행 ***");
		}*/
	}
}
