//
//
//
//
//


package persist.impl;

import java.util.*;
import java.sql.*;
import persist.*;

import except.*;
import model.entity.*;

public class AttributeIteratorImpl implements Iterator{
    
    // attributes
    ResultSet   a_rs = null;
    boolean     a_more = false;
    PersistenceModule 	pm = null;
	
    //constructor
    public AttributeIteratorImpl (ResultSet rs) throws UTradeException {
        a_rs = rs;
    	try{
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
        Category q_of_category = null;
        String q_name = null;
		
		long category_id;
		
        if (a_more){
            
            try{
                q_id = a_rs.getLong(1);
                category_id = a_rs.getLong(2);
                q_name = a_rs.getString(3);
                
                a_more = a_rs.next();
            }
            catch( Exception e ) {	// just in case...
                throw new NoSuchElementException( "No next Person object; root cause: " + e );
            }
			
			pm = PersistenceModuleFactory.createPersistenceModule();
			q_of_category = pm.restoreCategory(category_id);
			
            return ModelFactory.createAttribute(q_id, q_of_category, q_name);
        }
        else{
            throw new NoSuchElementException( "No next Club object" );
        }
    }
    
    public void remove(){
        throw new UnsupportedOperationException();
    }
    
}
