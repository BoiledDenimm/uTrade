

package model.ctrl;

import java.util.*;

import except.*;
import model.entity.*;
import persist.*;
import persist.impl.*;

public class CtrlFindAllCategories {
	
	static PersistenceModuleImpl   pm = null;
	static Vector<Category>    sv =  new Vector<Category>();
	static CategoryIteratorImpl           cit = null;
	static Category            c = null;
    
	public static Vector<Category> findAllCategories() throws UTradeException{
        
		pm = PersistenceModuleFactory.createPersistenceModule();
		cit = pm.restoreCategories();
		populate();
		return sv;
	}
	
	public static Vector<Category> findAllChildren(long p_id) throws UTradeException{
		
		pm = PersistenceModuleFactory.createPersistenceModule();
		cit = pm.restoreChildrenCategories(p_id);
		populate();
		return sv;
   	}
	
	public static void populate() throws UTradeException{
		
		while(cit.hasNext()){
			c = (Category) cit.goNext();
			sv.add(c);
		}
	}
	
}
