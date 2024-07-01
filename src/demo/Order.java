package demo;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderId;
	private List<String> itemsNames;
	private boolean cashOnDelivery;
	
	public Order(int orderId, List<String> itemsNames, boolean cashOnDelivery) {
		this.orderId = orderId;
		this.itemsNames = itemsNames;
		this.cashOnDelivery = cashOnDelivery;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder(itemsNames.toString());
		return str.substring(1,str.length()-1);
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<String> getItemsNames() {
		return itemsNames;
	}

	public void setItemsNames(List<String> itemsNames) {
		this.itemsNames = itemsNames;
	}

	public boolean isCashOnDelivery() {
		return cashOnDelivery;
	}

	public void setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}
	
	
}
