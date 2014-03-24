package model.ctrl;

import except.*;
import model.entity.*;
import persist.*;

public class CtrlCreateBilling {
    
    public static long createBilling(String adNum, String stName, String zip, String aptNum, String state)
    throws UTradeException {
        
        PersistenceModule pm = PersistenceModuleFactory.createPersistenceModule();;
        Billing b  = null;
        long billing_id = 0;
        
		b = ModelFactory.createBilling(adNum, stName, zip, aptNum, state);
        billing_id = pm.storeBilling(b);
        
        return billing_id;
    }
}

