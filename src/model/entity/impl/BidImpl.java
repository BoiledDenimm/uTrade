package model.entity.impl;

import java.util.*;
import model.entity.*;

public class BidImpl implements Bid {
	
    // Entity attr
    private long    b_id;
    private boolean b_written;
    
    // Bid attr
    private User b_of_User;
    private Item b_of_Item;
    private double b_value;
    
    // Empty constructor
    public BidImpl() {
        b_id=0;
        b_written = false;
        b_of_User = null;
        b_of_Item = null;
        b_value = 0;
    }
    
    // When creating a new bid object
    public BidImpl(User of_User, Item of_Item, double value) {
        b_id=0;
        b_written = false;
        b_of_User = of_User;
        b_of_Item = of_Item;
        b_value = value;
    }
    
    // When retrieving from db
    public BidImpl(long id, User of_User, Item of_Item, double value) {
        b_id=id;
        b_written = false;
        b_of_User = of_User;
        b_of_Item = of_Item;
        b_value = value;
    }
    
    //entity methods
    public boolean  get_isProxy()
    { return b_written; }
    
    public void  set_isProxy()
    { b_written = true; }
    
    public long  get_id()
    { return b_id; }
    
    public void  set_id( long id )
    { b_id = id; }
    
    // getters
	public User getOf_User() {
        return b_of_User;
    }
    
	public Item getOf_Item() {
        return b_of_Item;
    }
    
	public double getValue() {
        return b_value;
    }
    
    // setters
	public void setOf_User(User bidder) {
        b_of_User = bidder;
    }
    
	public void setOf_Item(Item item) {
        b_of_Item = item;;
    }
    
	public void setValue(double value) {
        b_value = value;
    }
}
