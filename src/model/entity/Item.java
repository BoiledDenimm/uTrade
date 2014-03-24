//
//
//

package model.entity;

import java.util.*;
import except.*;

public interface Item extends Entity{
    //getters
    public User getSeller();
    public Bid getTopBid();
    public double getMinBid();
    public Date getAuctionEnd();
    public String getName();
    public int getQuantity();
    public Vector<AttributeValue> getAttributes() throws UTradeException;
    public Vector<Bid> getBids() throws UTradeException;
    public double getFinalPrice();
    public Category getCategory();
    public boolean getIsActive();	 
    public User getWinner();
    //setters
    public void setSeller(User seller);
    public void setTopBid(Bid bid);
    public void setMinBid(double minBid);
    public void setAuctionEnd(Date endingDate);
    public void setName(String name);
    public void setQuantity(int quantity);
    public void setFinalPrice(double price);
    public void setCategory(Category category);
    public void setIsActive(boolean isActive);
    public void setWinner(User winner);	
}
