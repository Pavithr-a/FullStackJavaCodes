package SBA7;

public class OrderItems3 {

	int orderNumber;
	String OrderName;
	int orderPrice;
	
	public OrderItems3(int orderNumber, String orderName, int orderPrice) {
		super();
		this.orderNumber = orderNumber;
		OrderName = orderName;
		this.orderPrice = orderPrice;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderName() {
		return OrderName;
	}

	public void setOrderName(String orderName) {
		OrderName = orderName;
	}

	public int getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	
}
