//command line args 를 사용해보자.
//프로그램 실행시 프로그램명 뒤에 값을 입력하면 순서대로 String args[]에 들어간다.(" "으로 구분)
//두 수를 받아 더한 값을 리턴하는 프로그램을 만들어보자.
//args를 이용한 프로그램에서 args 입력이 없는 것을 체크하려면 args.length == 0 로 확인하면 된다.

public class CommandLineArgs {
	public static void main(String[] args) {
		
//cmd 에서 java /경로/CommandLineArgs 13 24 하거나
//이클립시에서 메뉴중에 run --> run config --> args에서 값입력.
		
		if (args.length==2) {
			int result = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
			System.out.println(result);
		}
		else {
			System.out.println("정신 차려");
			System.out.println("사용법 : 명령 인자 인자");
		}
		return ; //종료
		//C에서는 강제종료 exit(1);
		//java에서는 System.exit(1);
		//C#에서는 Environment.exit(1);
		//return ; 은 모든 언어에서 공통적.
	}
}
