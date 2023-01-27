package Chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		int price = 10000;
		System.out.println("-----------VIP고객-----------");
		VIPCustomer vipcs = new VIPCustomer(1004, "홍길동",900);
		
		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님이"+vipprice+"원을 지불 완료하였습니다");
		System.out.println(vipcs.showCusTomer());
		
		System.out.println("-----------일반고객-----------");
		price=10000;
		Customer cs = new Customer(1005,"안녕");
		System.out.println(cs.getCustomerName()+"님이"+cs.calcPrice(price)+"원을 지불 완료하였습니다");
		System.out.println(cs.showCusTomer());
		
	}

}
