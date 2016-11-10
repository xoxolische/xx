package controller;

import model.Card;
import model.OrderDTO;
import model.OrderProcessor;

public class OrderController{
    
    public OrderController(){
	
    }
    
    public void makeOrder(String jsonData){
	OrderDTO ord_dto = new OrderDTO();
	//now we need to set all fields
	ord_dto.setCard(new Card());
	
	OrderProcessor ord_proc = new OrderProcessor();
	ord_proc.process(ord_dto);
    }

}
