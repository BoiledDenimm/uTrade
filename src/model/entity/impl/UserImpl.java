package model.entity.impl;

import java.util.*;
import model.entity.*;
import model.ctrl.*;
import except.*;

public class UserImpl implements User {
	
	//Entity Attributes
    private long    u_id;
    private boolean u_written;
    
    // user attr
    private String u_fn, u_ln, u_email, u_pass;
	private boolean u_isAdmin;
    
    // empty constructor
	public UserImpl(){
        this.u_id = 0;
        this.u_written = false;
        this.u_fn="Unknown";
        this.u_ln="Unknown";
        this.u_email="Unknown";
        this.u_pass="Unknown";
        this.u_isAdmin=false;
	}
    
    // new simple user object
	public UserImpl(String fn, String ln, String email, String pass, boolean isAdmin){
		this.u_id = 0;
        this.u_written = false;
        this.u_fn=fn;
        this.u_ln=ln;
        this.u_email=email;
        this.u_pass=pass;
        this.u_isAdmin=isAdmin;
	}
    
    // when retrieving from db
    public UserImpl(long id, String fn, String ln, String email, String pass, boolean isAdmin){
        this.u_id = id;
        this.u_written = false;
        this.u_fn=fn;
        this.u_ln=ln;
        this.u_email=email;
        this.u_pass=pass;
    	this.u_isAdmin = isAdmin;
    }
    
	//entity methods
    public boolean  get_isProxy()
    { return u_written; }
    
    public void  set_isProxy()
    { u_written = true; }
    
    public long  get_id()
    { return u_id; }
    
    public void  set_id( long id )
    { u_id = id; }
    
    // get
	public String getFirstName(){
		return this.u_fn;
	}
    
	public String getLastName(){
		return this.u_ln;
	}
    
	public String getEmail(){
		return this.u_email;
	}
    
	public String getPassword(){
		return this.u_pass;
	}
    
	public boolean getIsAdmin(){
		return this.u_isAdmin;
	}
    
	public Vector<Item> getBiddingItems() throws UTradeException{
		return CtrlFindAllItems.findBiddingItems(u_id);
	}
	
	public Vector<Item> getWonItems() throws UTradeException{
		return CtrlFindAllItems.findWonItems(u_id);
	}
	
	public Vector<Item> getSellingItems() throws UTradeException{
		return CtrlFindAllItems.findSellingItems(u_id);
	}
    
	public Vector<Item> getSoldItems() throws UTradeException{
		return CtrlFindAllItems.findSoldItems(u_id);
	}
	///////setters
	public void setFirstName(String fn){
		this.u_fn=fn;
	}
	
	public void setLastName(String ln){
		this.u_ln=ln;
	}
    
	public void setEmail(String email){
		this.u_email=email;
	}
    
	public void setPassword(String pass){
		this.u_pass=pass;
	}
    
	public void setIsAdmin(boolean isAdmin){
		this.u_isAdmin=isAdmin;
	}
    
}
