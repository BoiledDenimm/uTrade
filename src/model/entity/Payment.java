package model.entity;

import java.util.*;

public interface Payment extends Entity{
	
	public String getCardType();
	public String getCardNumber(); 
	public String getSecurityCode();
	public String getExpirationDate(); //date format: ddmmyyyy
	
	
	public void setCardType(String cardType);
	public void setCardNumber(String cardNumber);
	public void setSecurityCode(String code);
	public void setExpirationDate(String date); //date format: ddmmyyyy
	
}
