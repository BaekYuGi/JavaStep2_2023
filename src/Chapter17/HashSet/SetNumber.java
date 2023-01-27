package Chapter17.HashSet;

import java.util.HashSet;

public class SetNumber {
	
	public static void main(String[] args) {
		//정렬안됨 / 중복안됨
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(true) {
			int v = (int)(Math.random()*45+1);
			
			hs.add(v);
			
			if(hs.size() >=6) {
				break;
			}
			
			
		}
		System.out.println(hs);
	}
	
}
