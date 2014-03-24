
package model.ctrl;

import java.util.*;

import except.*;
import model.entity.*;
import persist.*;
import persist.impl.*;

public class CtrlFindAllAttributes{
	
	public static Vector<Attribute> findAllCategoryAttributes(long c_id) throws UTradeException{
		Attribute a;
		PersistenceModuleImpl pm = PersistenceModuleFactory.createPersistenceModule();
		Vector<Attribute> sv = new Vector<Attribute>();
		AttributeIteratorImpl ait = pm.restoreAttributes(c_id);
		
		while(ait.hasNext()){
			a = (Attribute) ait.goNext();
			sv.add(a);
		}
		
		return sv;
	
	}
}
