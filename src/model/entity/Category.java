//
//
//

package model.entity;
import except.*;
import java.util.*;

public interface Category extends Entity{
    //getters
    public Vector<Item> getItems() throws UTradeException;
	public Vector<Attribute> getAttributes() throws UTradeException;
    public double getPercentCharged();
    public Category getParentCategory();
	public Vector<Category> getChildrenCategory() throws UTradeException;
    public String getName();
    
    //setters
    public void setPercentCharged(double percent);
    public void setParentCategory(Category parent);
	public void setName(String name);
	
}
