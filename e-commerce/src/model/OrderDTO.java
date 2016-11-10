package model;

public class OrderDTO{

    private Card card;
    
    public OrderDTO(){
    }

    public Card getCard(){
	return card;
    }

    public void setCard(Card card){
	this.card = card;
    }

}
