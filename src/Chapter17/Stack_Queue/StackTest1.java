package Chapter17.Stack_Queue;

import java.util.Stack;

public class StackTest1 {

	public static void main(String[] args) {

		Object obj;
		// empty스택 생성
		Stack<Object> st = new Stack<Object>();
		//입력
		if (st.empty()) {// 스택이 비어있으면
			for (int i = 1; i <= 5; i++) {
				st.push(new String("Hi!" + i));
				System.out.println(" 입력" + i + "번째 : " + st.peek());
			}
		}
		
		//출력
		st.pop(); //밖으로 나오는 출력
		System.out.println("현재 Top의 위치(peek) : "+st.peek());

		st.push(new String("Happy!!"));
		System.out.println(st.peek());
		System.out.println(st);
		
	
	
	
	
	}

}
