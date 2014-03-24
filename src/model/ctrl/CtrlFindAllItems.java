
package model.ctrl;

import java.util.*;

import except.*;
import model.entity.*;
import persist.*;
import persist.impl.*;

public class CtrlFindAllItems {
    
    static PersistenceModuleImpl   pm = null;
    static Vector<Item>        sv = null;
    static ItemIteratorImpl    iit = null;
    static Item                i = null;
    
	public static Vector<Item> findBiddingItems(long user_id) throws UTradeException{
		iit= pm.restoreBiddingItems(user_id);
		populate();
		return sv;
	}
    
    public static Vector<Item> findWonItems(long user_id) throws UTradeException{
		
		//retrieving all won items
		iit = pm.restoreWonItems(user_id);
		populate();
		return sv;
	}
    
    public static Vector<Item> findSellingItems(long user_id) throws UTradeException{
        
        iit = pm.restoreSellingItems(user_id);
        populate();
        return sv;
    }
    
    public static Vector<Item> findSoldItems(long user_id) throws UTradeException{
		iit = pm.restoreSoldItems(user_id);
		populate();
		return sv;
	}
	
    public static Vector<Item> findCategoryItems(long category_id) throws UTradeException{
		iit = pm.restoreCategoryItems(category_id);
		populate();
		return sv;
    }
	
    public static void populate() throws UTradeException{
        while(iit.hasNext()){
            i = (Item) iit.goNext();
            sv.add(i);
        }
    }
    
	
    
    
    
}
