package Chapter17.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return (o1.compareTo(o2))*-1;
	}

}

public class ComparatorTest2 {

	public static void main(String[] args) {
		//오름차순
//		Set<String> set = new TreeSet<String>();
		Set<String> set = new TreeSet<String>(new MyCompare());
		
		set.add("aaa");
		set.add("ddd");
		set.add("bbb");
		set.add("ccc");
		System.out.println(set);
		
		
	}

}
