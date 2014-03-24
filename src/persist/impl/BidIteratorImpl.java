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

public class BidIteratorImpl implements Iterator{
    
    // attributes
    ResultSet   b_rs = null;
    boolean     b_more = false;
    PersistenceModule 	pm = null;
    //constructor
    public BidIteratorImpl (ResultSet rs) throws UTradeException {
        b_rs = rs;
        try {
            b_more = rs.next();
        }
        catch(Exception e){
            throw new UTradeException("Cannot create Item iterator; root cause: " + e);
        }
    }
    
    public boolean hasNext(){
        return b_more;
    }
    
    public Object next(){
		Object o = null;
		return o;
	}
	
	public Object goNext() throws UTradeException{
        
        long q_id = 0;
        User q_of_User = null;
        Item q_of_Item = null;
        double q_value = 0;
        
        long user_id = 0;
		long item_id = 0;
		
		if (b_more){
            
            try{
                q_id = b_rs.getLong(1);
                user_id = b_rs.getLong(2);
                item_id = b_rs.getLong(3);
                q_value = b_rs.getDouble(4);
                
                b_more = b_rs.next();
            }
            catch( Exception e ) {	// just in case...
                throw new NoSuchElementException( "No next Person object; root cause: " + e );
            }
			
			pm = PersistenceModuleFactory.createPersistenceModule();
			q_of_User = pm.restoreUser(user_id);
			q_of_Item = pm.restoreItem(item_id);
			
            return ModelFactory.createBid(q_id, q_of_User, q_of_Item, q_value);
        }
        else{
            throw new NoSuchElementException( "No next Club object" );
        }
    }
    
    public void remove(){
        throw new UnsupportedOperationException();
    }
    
}
