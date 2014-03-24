// A control class to implement the 'CreateUser' use case
package model.ctrl;

import except.*;
import model.entity.*;
import persist.*;

public class CtrlCreateUser {
    
    public static long createUser(String fn, String ln, String email, String password)
    throws UTradeException {
        
        PersistenceModule pm = null;
        User user  = null;
        long userid = 0;
        
        pm = PersistenceModuleFactory.createPersistenceModule();
        user = ModelFactory.createUser(fn, ln, email, password, false);
        userid = pm.storeUser(user);
        
        return userid;
    }
}

