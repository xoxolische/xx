package model;

public class Payment{
    
    private boolean status = false;

    public Payment(){
    }
    
    public void setStatus(boolean b){
	this.status = b;
    }
    
    public boolean getStatus(){
	return status;
    }

}
