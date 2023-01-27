package Chapter10;

import Chapter09.Customer;
import Chapter09.VIPCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {
		
		Customer cu = new Customer(10001,"이순신");
		
		cu.bounsPoint=1000;
		System.out.println(cu.showCusTomer());
		cu.setBounsRatio(0.5);
		
		VIPCustomer customerKim = new VIPCustomer(10002, "김유신", 1004);
		
		customerKim.bounsPoint=1000;
		System.out.println(customerKim.showCusTomer());
		int price = 10000;
		System.out.println(cu.getCustomerName() + "님이 " + cu.calcPrice(price) + "원을 지불 완료하였습니다.");
		
	}

}
