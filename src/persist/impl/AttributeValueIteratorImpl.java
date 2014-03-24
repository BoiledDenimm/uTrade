//
//
//
//
//


package persist.impl;

import java.util.*;
import java.sql.*;
import except.*;
import model.entity.*;
import persist.*;


public class AttributeValueIteratorImpl implements Iterator{
    
    // attributes
    ResultSet   a_rs = null;
    boolean     a_more = false;
    PersistenceModuleImpl 	pm = null;
    
    Item a_Item = null;
    //constructor
    public AttributeValueIteratorImpl (Item i , ResultSet rs) throws UTradeException {
        a_Item = i;
        a_rs = rs;
        try {
            a_more = rs.next();
        }
        catch(Exception e){
            throw new UTradeException("Cannot create Item iterator; root cause: " + e);
        }
    }
    
    public boolean hasNext(){
        return a_more;
    }
    
    public Object next(){
		Object o = null;
		return o;
	}
	
	public Object goNext() throws UTradeException{
        
        long q_id = 0;
        String q_value = null;
        Item q_of_item = null;
        Attribute q_of_attribute = null;
        
        long item_id = 0;
        long attribute_id =0;
        
        if (a_more){
            
            try{
                q_id = a_rs.getLong(1);
                q_value = a_rs.getString(2);
                item_id = a_rs.getLong(3);
                attribute_id = a_rs.getLong(4);
                
                a_more = a_rs.next();
            }
            catch( Exception e ) {	// just in case...
                throw new NoSuchElementException( "No next Person object; root cause: " + e );
            }
            pm = PersistenceModuleFactory.createPersistenceModule();
			
            q_of_item = pm.restoreItem(item_id);
            q_of_attribute = pm.restoreAttribute(attribute_id);
            return ModelFactory.createAttributeValue(q_id, q_value, q_of_item, q_of_attribute);
        }
        else{
            throw new NoSuchElementException( "No next Club object" );
        }
    }
    
    public void remove(){
        throw new UnsupportedOperationException();
    }
    
}
