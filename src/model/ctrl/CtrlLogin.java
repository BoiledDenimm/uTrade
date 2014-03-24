// A control class to implement the 'Login' use case
package model.ctrl;

import except.*;
import model.entity.*;
import persist.*;

public class CtrlLogin {
    
    public static boolean validateUser(String email, String pass)
    throws UTradeException {
        
		PersistenceModule pm = PersistenceModuleFactory.createPersistenceModule();
        return pm.validateUser(email,pass);
		
	}
	
    public static User login(String email, String pass) throws UTradeException{
		
		PersistenceModule pm = PersistenceModuleFactory.createPersistenceModule();
		
		return pm.restoreUser(email, pass);
		
		
    }

    public static boolean isAdmin(long user_id) throws UTradeException{
	PersistenceModule pm = PersistenceModuleFactory.createPersistenceModule();
    	User user = pm.restoreUser(user_id);
	return user.getIsAdmin();
    }
}

