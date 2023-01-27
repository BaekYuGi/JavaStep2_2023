package Chapter17.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		//리스트 구조를 갖는 ArrayList클래스의 객체생성
		//배열 : String[] ls1={};
		List<String> ls=new ArrayList<String>();
		ls.add("HI!");
		ls.add("Happy!");
		ls.add("Nice!");
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}
		System.out.println();
		System.out.println("-----데이터 추가후-----");
		ls.add(3, "Good");
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}
		
		System.out.println();
		System.out.println("-----데이터 삭제후-----");
		ls.remove(2);
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ls.get(i).toString());
		}
	}

}
