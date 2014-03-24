// A control class to implement the 'GetUser' use case
package model.ctrl;

import except.*;
import model.entity.*;
import persist.*;

public class CtrlGetUser {
    
    public static User getUser(long id)
    throws UTradeException {
        
        PersistenceModule pm = null;
        User user  = null;
        
        pm = PersistenceModuleFactory.createPersistenceModule();
	User u = pm.restoreUser(id);

	return u;        
    }
}

