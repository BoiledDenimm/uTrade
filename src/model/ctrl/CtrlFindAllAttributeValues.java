
package model.ctrl;



import java.util.*;

import except.*;
import model.entity.*;
import persist.impl.*;
import persist.*;


public class CtrlFindAllAttributeValues {
    
    public static Vector<AttributeValue> findAllAttributeValues(long item_id) throws UTradeException{
        
        PersistenceModuleImpl 	pm = PersistenceModuleFactory.createPersistenceModule();
        Vector<AttributeValue>	sv  = new Vector<AttributeValue>();
        AttributeValueIteratorImpl ait = null;
        AttributeValue			a = null;
		
        Item item = pm.restoreItem(item_id);
        
        // retrieve all AV objects
        //
        ait = pm.restoreAttributeValues(item);
        
        while( ait.hasNext() ) {
            
            a = (AttributeValue) ait.goNext();
            sv.add( a );
            
        }
        
        return sv;
    }
}
