package persist;


import except.*;
import persist.impl.*;


public class PersistenceModuleFactory {

  private static final String url = "jdbc:mysql://localhost/team10";
  private static final String user = "team10";
  private static final String pass = "virtual";

  public static PersistenceModuleImpl createPersistenceModule()
        throws UTradeException
    { return new PersistenceModuleImpl(url,user,pass); }

};
