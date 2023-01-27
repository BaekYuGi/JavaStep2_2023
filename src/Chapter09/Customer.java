package Chapter09;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public double bounsPoint;
	protected double bounsRatio;
	
	public Customer() {
		customerGrade="S";
		bounsRatio=0.01;
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade="SILVER";
		bounsRatio=0.01;
	
	}
	public int  calcPrice(int price) {
		bounsPoint = bounsPoint+bounsRatio*price;
		
		return price;
	}
	
	public String showCusTomer() {
		return customerName+"님의 등급은"+customerGrade+"이며 보너스 포인트는 "+bounsPoint;
		
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public double getBounsPoint() {
		return bounsPoint;
	}
	public void setBounsPoint(double bounsPoint) {
		this.bounsPoint = bounsPoint;
	}
	public double getBounsRatio() {
		return bounsRatio;
	}
	public void setBounsRatio(double bounsRatio) {
		this.bounsRatio = bounsRatio;
	}
	
	
	
	
}
