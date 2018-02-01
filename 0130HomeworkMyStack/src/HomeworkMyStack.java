
public class HomeworkMyStack {
	public static void main(String[] args) {
		MyStack ms = new MyStack(5);
		
		//스택이 꽉찼는지 비었는지 확인해보자.
		System.out.println("현재 스택이 비어있나요? "+ms.isEmpty());
		System.out.println("현재 스택이 가득 차있나요? "+ms.isFull());
		
		//push를 해보자.
		ms.push("메롱");
		ms.push("메로롱");
		ms.push("메로로롱");
		ms.push("메로로로롱");
		ms.push("메로로로로롱");
		ms.push("메로로로로로롱");
		
		//pop을 해보자.
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		
		
		ms.push("메롱");
		ms.push("메로롱");
		ms.push("메로로롱");
		ms.push("메로로로롱");
		
		//peek을 사용해보자.
		System.out.println("peek : "+ms.peek());
		
		//스택의 용량을 변경해보자.
		System.out.println("현재 스택의 capacity는 "+ms.getCapacity()+"이다. ");
		ms.setCapacity(10); //스택의 용량을 변경해보자.
		System.out.println("현재 스택의 capacity는 "+ms.getCapacity()+"이다. ");
		ms.setCapacity(5); //스택의 용량을 변경해보자.
		System.out.println("현재 스택의 capacity는 "+ms.getCapacity()+"이다. ");
	
		//search를 해보자.
		String str = "메로롱";
		if (ms.search(str)>-1) {
			System.out.println(str+"의 위치는 "+ms.search(str)+"입니다.");
		}
		else
			System.out.println(str+"은 스택에 없습니다.");
	
		//length를 찍어보자.
		System.out.println("현재 길이는 "+ms.leng()+"입니다.");
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("pop : "+ms.pop());
		System.out.println("현재 길이는 "+ms.leng()+"입니다.");
	}
}

class MyStack { // String배열로 스택을 만들어보자.
	private String[] strarr;
	private int peek = -1;
	private int capacity;

	// 생성자에서 스택의 크기를 정하고 시작한다.
	public MyStack() { // 기본 크기 10
		this.strarr = new String[10];
		this.capacity = 10;
	}

	public MyStack(int capacity) {
		this.strarr = new String[capacity];
		this.capacity =capacity;
	}
	
	
	public int getCapacity() { //현재 스택의 용량
		return capacity;
	}

	public void setCapacity(int capacity) { //배열의 크기를 변경하자.
		//배열의 크기를 늘리고 기존의 내용을 복사해준다.
		//배열의 크기가 줄어든 경우, 잘리는 부분을 없애준다.
		String temp[] = strarr.clone();
		strarr = new String[capacity];
		for (int i = 0; i < ((this.capacity>capacity) ? capacity : this.capacity); i++) {
			strarr[i] = temp[i];
		}
		this.capacity = capacity;
	}


	/*
	 * MyStack Methods.. 1. push 2. pop 3. isEmpty 4. peek 5. search
	 */
	
	public int leng() { //현재 스택의 용량
		return peek+1;
	}
	
	
	public void push(String str) {
		if (this.isFull()) {
			System.out.println("스택이 가득 찼어요");
		}
		else{
			strarr[++peek] = str;
		}
	}

	public String pop() { // error처리 다시 고민.
		try {
			String temp = strarr[peek];
			strarr[peek--] = null;
			return temp;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("스택이 비어있습니다. null을 반환합니다.");
			return null;
		}
	}

	public boolean isEmpty() {
		if (peek <= -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if (capacity-1 == peek) {
			return true;
		} else {
			return false;
		}
	}

	public String peek() {
		try {
			return strarr[peek];
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("no element");
			return null;
		}

	}

	public int search(String str) { // 있으면 index(첫번째 발견) 없으면 -1
		for (int j = 0; j <= peek; j++) {
			if (strarr[j].equals(str)) {
				return j;
			}
		}
		return -1;
	}
}