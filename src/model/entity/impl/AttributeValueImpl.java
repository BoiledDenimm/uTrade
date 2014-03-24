//
//
//
//
//

package model.entity.impl;


import java.util.*;
import model.entity.*;

public class AttributeValueImpl implements AttributeValue{

    //Entity Attributes
    private long a_id;
    private boolean a_written;
    
    //Attribute Value
    private String a_value;
    private Item a_Of_Item;
    private Attribute a_Of_Attribute;
    
    //Constructors
    public AttributeValueImpl(){
        
        a_id = 0;
        a_written = false;
        a_value = "Unknown";
        a_Of_Item = null;
        a_Of_Attribute = null;
    }
    
    public AttributeValueImpl(String value, Item of_Item, Attribute of_Attribute){
        
        a_id = 0;
        a_written = false;
        a_value = value;
        a_Of_Item = of_Item;
        a_Of_Attribute = of_Attribute;
    }
    
    public AttributeValueImpl(long id, String value, Item of_Item, Attribute of_Attribute){
        
        a_id = id;
        a_written = true;
        a_value = value;
        a_Of_Item = of_Item;
        a_Of_Attribute = of_Attribute;
    }
    
    // Entity methods
    //
    public boolean  get_isProxy()
    { return a_written; }
    
    public void  set_isProxy()
    { a_written = true; }
    
    public long  get_id()
    { return a_id; }
    
    public void  set_id( long id )
    { a_id = id; }

    //AttributeValue methods
    //getters
    public String   get_Value() {return a_value;}
    public Item     get_Of_Item() {return a_Of_Item;}
    public Attribute get_Of_Attribute() {return a_Of_Attribute;}
    
    //Setters
    public void     set_Value(String value) {a_value = value;}
    public void     set_Of_Item(Item of_Item) {a_Of_Item = of_Item;}
    public void     set_Of_Attribute(Attribute of_Attribute) {a_Of_Attribute = of_Attribute;}
}
