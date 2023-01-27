package Chapter09;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRation;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="VIP";
		bounsRatio=0.05;
		this.agentID=agentID;
		saleRation=0.1;
	}

	@Override
	public int calcPrice(int price) {

		bounsPoint=(price-(int)(price*saleRation))*bounsRatio;
		return price-(int)(price*saleRation);
	}

	@Override
	public String showCusTomer() {
		return super.showCusTomer()+"\n전문상담원은 "+agentID+"입니다";
	}

	public int getAgentID() {
		return agentID;
	}
	
}
