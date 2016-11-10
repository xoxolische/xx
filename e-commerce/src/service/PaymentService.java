package service;

import model.Card;
import model.Invoice;
import model.Payment;


public class PaymentService{
    
    public PaymentService(){
	
    }
    
    public Payment makePayment(Invoice invoice, Card card){
	Payment payment = new Payment();
	payment.setStatus(true);
	return payment;
    }
	
	
}