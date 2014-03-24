package model.entity;

import java.util.*;

public interface Bid extends Entity{
	
	public User getOf_User();
	public Item getOf_Item();
	public double getValue();

	public void setOf_User(User bidder);
	public void setOf_Item(Item item);
	public void setValue(double value);
	
}
