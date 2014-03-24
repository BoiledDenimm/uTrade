// A control class to implement the 'CreateUser' use case
package model.ctrl;

import except.*;
import model.entity.*;
import persist.*;
import java.util.*;
import java.util.Vector;

public class CtrlStoreSession {
    
	public static void storeSession(long id, String session)
 	   throws UTradeException {
        System.out.println("Made it into storeSession in CtrlStoreSession");
        PersistenceModule pm = null;
        long itemid = 0;
        
        pm = PersistenceModuleFactory.createPersistenceModule();

	pm.storeSession(id,session);        
    }
}

