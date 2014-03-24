package except;


public class UTradeException

  extends Exception

{
  public UTradeException( String msg )
  {
    super( msg );
  }

  public UTradeException( Throwable cause )
  {
    super( cause );
  }

};
