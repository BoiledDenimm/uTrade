// A control class to implement the 'Login' use case
package model.ctrl;

import except.*;
import model.entity.*;
import persist.*;

public class CtrlValidateSession {
    
    public static boolean validateSession(String session)
    throws UTradeException {
        
	PersistenceModule pm = PersistenceModuleFactory.createPersistenceModule();
        return pm.validateSession(session);
		
	}
	
}

