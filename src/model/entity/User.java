
package model.entity;

import java.util.*;
import except.*;

public interface User extends Entity{ 
   
   //getters
    public String getFirstName();
    public String getLastName();
    public String getEmail();
    public String getPassword();
    public boolean getIsAdmin();
	public Vector<Item> getBiddingItems() throws UTradeException;
    public Vector<Item> getWonItems() throws UTradeException;
    public Vector<Item> getSellingItems() throws UTradeException;
    public Vector<Item> getSoldItems() throws UTradeException;
    //setters
    public void setFirstName(String firstName);
    public void setLastName(String lastName);
    public void setEmail(String email);
    public void setPassword(String password);
    public void setIsAdmin(boolean isAdmin);


}
