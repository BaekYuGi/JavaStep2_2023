package Chapter17.HashSet;

import java.util.HashSet;

import Chapter17.Member;

public class HashSetMain {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("김창우"));
		hashSet.add(new String("박범준"));
		hashSet.add(new String("정세나"));
		hashSet.add(new String("백유기"));
		hashSet.add(new String("박수연"));
		hashSet.add(new String("김우태"));
		
		System.out.println(hashSet);
		hashSet.add(new String("백유기"));
		System.out.println(hashSet);
		
	}

}
