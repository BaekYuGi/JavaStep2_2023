package Chapter19.Stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		List<TravelCustomer> customerList = new ArrayList<>();
		TravelCustomer travel1 = new TravelCustomer("홍길동", 22, 30000);
		TravelCustomer travel2 = new TravelCustomer("이순신", 25, 15000);
		TravelCustomer travel3 = new TravelCustomer("강감찬", 19, 20000);
		
		customerList.add(travel1);
		customerList.add(travel2);
		customerList.add(travel3);
		
		System.out.println("==고객 명단 추가된 순서대로 출력==");
		//map : 데이터를 특정조건에 해당하는 값으로 변환해 줌
		customerList.stream().map(c ->c.getName()).forEach(a->System.out.println(a));
		//mapToInt : int형 자료로 변환
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 금액 : "+total);
		//filter : 특정 조건에 맞는 데이터만 걸러낸다
		System.out.println("==20세 이사으이 고객의 이름을 정렬하여 출력==");
		customerList.stream().filter(c -> c.getAge()>=20).map(c -> c.getName()).sorted().forEach(a->System.out.println(a));
		
		
		
		
		
	}
	

}
