//
//
//
//
//

package model.ctrl;

import java.util.*;

import except.*;
import model.entity.*;
import persist.*;
import persist.impl.*;

public class CtrlFindAllBids {
	
    public static Vector<Bid> findAllUserBids(long user_id) throws UTradeException{
        
        PersistenceModuleImpl   pm = PersistenceModuleFactory.createPersistenceModule();
        Vector<Bid>         sv = new Vector<Bid>();
		BidIteratorImpl            bit = null;
        Bid                 b = null;
		
        //retrieving all Bids
        bit = pm.restoreUserBids(user_id);
        
        while(bit.hasNext()){
            b = (Bid) bit.goNext();
            sv.add(b);
        }
        
        return sv;
    }
	
	public static Vector<Bid> findAllItemBids(long item_id) throws UTradeException{
        
        PersistenceModuleImpl   pm = PersistenceModuleFactory.createPersistenceModule();
        Vector<Bid>         sv = new Vector<Bid>();
		BidIteratorImpl            bit = null;
        Bid                 b = null;
		
        //retrieving all Bids
        bit = pm.restoreItemBids(item_id);
        
        while(bit.hasNext()){
            b = (Bid) bit.goNext();
            sv.add(b);
        }
        
        return sv;
    }
	
	
	
}
