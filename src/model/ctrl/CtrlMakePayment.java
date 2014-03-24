// A control class to implement the 'MakePayment' use case
package model.ctrl;

import except.*;
import model.entity.*;
import persist.*;

public class CtrlMakePayment {
    
    public static long makePayment(String cardType, String secCode, String expDate, String cardNum)
    throws UTradeException {
        
        PersistenceModule pm = null;
        Payment payment = null;
        long paymentid = 0;
        
        pm = PersistenceModuleFactory.createPersistenceModule();
        payment = ModelFactory.createPayment(cardType, secCode, expDate, cardNum);
        paymentid = pm.storePayment(payment);
        
        return paymentid;
    }
}

