//
//
//
//
//


package model.entity;

import java.util.*;

public interface AttributeValue extends Entity{

    //getters
    
    public String   get_Value();
    public Item     get_Of_Item();
    public Attribute get_Of_Attribute();
    
    //setters
    public void     set_Value(String value);
    public void     set_Of_Item(Item of_Item);
    public void     set_Of_Attribute(Attribute of_Attribute);
    
}
