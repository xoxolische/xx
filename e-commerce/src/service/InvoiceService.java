package service;

import model.Invoice;
import model.Order;

public class InvoiceService{

    public InvoiceService(){
	
    }
    
    public Invoice form(Order order){
	
	Invoice invoice = new Invoice(order);
	//make some operations 
	
	return invoice;
    }

}
