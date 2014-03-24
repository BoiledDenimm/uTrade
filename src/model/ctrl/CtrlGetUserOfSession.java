// A control class to implement the 'CreateUser' use case
package model.ctrl;

import except.*;
import model.entity.*;
import persist.*;

public class CtrlGetUserOfSession {
    
    public static User getUser(String session)
    throws UTradeException {
        
        PersistenceModule pm = null;
        User user  = null;
        
        pm = PersistenceModuleFactory.createPersistenceModule();
	User u = pm.restoreUserOfSession(session);

	return u;
    }
}

