// A control class to implement the 'CreateUser' use case
package model.ctrl;

import except.*;
import model.entity.*;
import persist.*;

public class CtrlGetCategory {
    
    public static Category getCategory(String cn)
    throws UTradeException {
        
        PersistenceModule pm = null;
        User user  = null;
        
        pm = PersistenceModuleFactory.createPersistenceModule();
	Category c = pm.restoreCategory(cn);

	return c;
    }
}

