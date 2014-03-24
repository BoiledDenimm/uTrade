//
//
//
//
//

package model.entity.impl;

import model.entity.*;
import java.util.*;
import model.ctrl.*;
import except.*;

public class CategoryImpl implements Category{
    
    //Entity Attributes
    private long        c_id;
    private boolean     c_written;
	
    //Category Attributes
    private double          c_PercentCharged;
    private Category        c_ParentCategory;
    private String c_Name;
    
    //Constructors
    //Empty constructor
    public CategoryImpl(){
        c_id = 0;
        c_written = false;
        c_PercentCharged = 0;
		c_Name = "Unknown";
    }
    
    //Created by the admin via the form
    public CategoryImpl(double percentCharged, String name){
        
        c_id = 0;
        c_written = false;
        c_PercentCharged = percentCharged;
		c_Name = name;
    }
    
    //Retrieving the information from the datbase
    public CategoryImpl(long id, double percentCharged, String name){
        c_id = id;
        c_written = true;
        c_PercentCharged = percentCharged;
        c_Name = name;
    }
    
    //Entity methods
    public boolean  get_isProxy()
    { return c_written; }
    
    public void  set_isProxy()
    { c_written = true; }
    
    public long  get_id()
    { return c_id; }
    
    public void  set_id( long id )
    { c_id = id; }
	
    
    //getters
    public Vector<Item> getItems() throws UTradeException{
		return CtrlFindAllItems.findCategoryItems(c_id);
    }
    public Vector<Attribute> getAttributes() throws UTradeException{
		return CtrlFindAllAttributes.findAllCategoryAttributes(c_id);
		
    }
    public double getPercentCharged(){return c_PercentCharged;}
    public Category getParentCategory(){return c_ParentCategory;}
    public Vector<Category> getChildrenCategory() throws UTradeException{
		return CtrlFindAllCategories.findAllChildren(c_id);
		
    }
    public String getName(){return c_Name;}
    
    //setters
    public void setPercentCharged(double percent){c_PercentCharged = percent;}
    public void setParentCategory(Category parent){c_ParentCategory = parent;}
    public void setName(String name){c_Name = name;}
	
}
