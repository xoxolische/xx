package model;

import service.InvoiceService;
import service.PaymentService;

public class OrderProcessor{
    
    public OrderProcessor(){
	
    }
    
    
    public void process(OrderDTO ord_dto){
	//making order with our DATA TRANSFERED OBJECT
	Order order = new Order(ord_dto);
	
	//Mmaking invoice
	InvoiceService invoice_service = new InvoiceService();
	Invoice invoice = invoice_service.form(order);
	
	PaymentService payment_service = new PaymentService();
	Payment payment = payment_service.makePayment(invoice, ord_dto.getCard());
	
	if(payment.getStatus()==true){
	    //do smth good
	}else{
	    //do smth bad
	}
	
	
    }
}
