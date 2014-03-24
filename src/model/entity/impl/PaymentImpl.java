package model.entity.impl;

import java.util.*;
import model.entity.*;

public class PaymentImpl implements Payment {
	
    //Entity Attributes
    private long    p_id;
    private boolean p_written;
    
    // Payment Attributes
	private String p_cardType;
	private String p_secCode;
    private String p_expDate;
	private String p_cardNum;
    
	// empty contructor
    public PaymentImpl() {
        this.p_id = 0;
        this.p_written = false;
        this.p_cardType = "Unknown";
        this.p_secCode = "";
        this.p_expDate = "";
        this.p_cardNum = "";
    }
    
    // new simple payment object
	public PaymentImpl(String cardType, String secCode, String expDate, String cardNum){
		this.p_id = 0;
        this.p_written = false;
        this.p_cardType=cardType;
		this.p_secCode=secCode;
		this.p_expDate=expDate;
		this.p_cardNum=cardNum;
	}
    
    // when retrieving from db
    public PaymentImpl(long id, String cardType, String secCode, String expDate, String cardNum){
        this.p_id = id;
        this.p_written = false;
        this.p_cardType=cardType;
		this.p_secCode=secCode;
		this.p_expDate=expDate;
		this.p_cardNum=cardNum;
    }
    
    //entity methods
    public boolean  get_isProxy()
    { return p_written; }
    
    public void  set_isProxy()
    { p_written = true; }
    
    public long  get_id()
    { return p_id; }
    
    public void  set_id( long id )
    { p_id = id; }
	
    // get
    
	public String getSecurityCode(){
		return this.p_secCode;
	}
    
	public String getExpirationDate(){
		return this.p_expDate;
	}
    
	public String getCardNumber(){
		return this.p_cardNum;
	}
    
    public String getCardType() {
        return this.p_cardType;
    }
    
    
	///////setters
	public void setCardType(String cardType){
		this.p_cardType=cardType;
	}
    
	public void setSecurityCode(String secCode){
		this.p_secCode=secCode;
	}
    
	public void setExpirationDate(String expDate){
		this.p_expDate=expDate;
	}
	
	public void setCardNumber(String cardNum){
		this.p_cardNum=cardNum;
	}
}
