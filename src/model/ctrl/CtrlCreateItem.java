// A control class to implement the 'CreateItem' use case
package model.ctrl;

import except.*;
import model.entity.*;
import persist.*;
import java.util.*;
import java.util.Vector;

public class CtrlCreateItem {
    
    public static long createItem(double minBid, User seller, Date auctionEnd, String name, int quantity, Category category)
    throws UTradeException {
       
        PersistenceModule pm = null;
		double d = 0;
		Bid b = null;
		User winner = null;
        long itemid = 0;
        
        pm = PersistenceModuleFactory.createPersistenceModule();
        Item item = ModelFactory.createItem(d, minBid, seller, b, auctionEnd,  name, quantity, category, winner);
        System.out.println("WE MADE AN ITEM in CTRLCREATEITEM!!!!!!!!!!!!!!!!!!!!!!!!! ");
		itemid = pm.storeItem(item);
		System.out.println("WE STORED AN ITEM!!!!!!!!!!!!!!!!!!!!!!!!! ");

        
        return itemid;
    }
}

