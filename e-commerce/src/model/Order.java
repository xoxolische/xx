package model;

import java.util.ArrayList;

public class Order{

    private ArrayList<OrderItem> items;
	
	public Order(OrderDTO ord_dto){	
	    items = new ArrayList<OrderItem>();
	}

	
	public void addItem(OrderItem unit){
		items.add(unit);
	}

}
