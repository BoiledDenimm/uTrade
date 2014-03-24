package persist;


import java.util.*;
import java.sql.*;
import model.entity.*;
import except.*;
import persist.impl.*;

public interface PersistenceModule {
	
	public Item		restoreItem( long id ) throws UTradeException;
	//public ItemIteratorImpl restoreItems(long u_id) throws UTradeException;
	public long		storeItem(Item item) throws UTradeException;
	
	public ItemIteratorImpl restoreBiddingItems(long user_id) throws UTradeException;
	public ItemIteratorImpl restoreWonItems(long user_id) throws UTradeException;
	public ItemIteratorImpl restoreSoldItems(long user_id) throws UTradeException;
	
	public User		restoreUser(long id) throws UTradeException;
	public User		restoreUser(String email, String pass) throws UTradeException;
	public long		storeUser(User user) throws UTradeException;
	public User		restoreUserOfSession(String session) throws UTradeException;	
	
	public Bid		restoreBid(long id) throws UTradeException;
	public BidIteratorImpl restoreUserBids(long id) throws UTradeException;
	public BidIteratorImpl restoreItemBids(long id) throws UTradeException;
	public long		storeBid(Bid bid) throws UTradeException;
	
	public Category restoreCategory(long id) throws UTradeException;
	public Category restoreCategory(String name) throws UTradeException;
	public CategoryIteratorImpl restoreCategories() throws UTradeException;
	public long		storeCategory(Category c) throws UTradeException;
	
	public ItemIteratorImpl restoreCategoryItems(long c_id) throws UTradeException;
	
	public CategoryIteratorImpl restoreChildrenCategories(long parent_id) throws UTradeException;
	
	public Billing	restoreBilling(long id) throws UTradeException;
	public long		storeBilling(Billing b) throws UTradeException;
	
	public Attribute restoreAttribute(long id) throws UTradeException;
	public AttributeIteratorImpl restoreAttributes(long c_id) throws UTradeException;
	public long 	storeAttribute(Attribute a) throws UTradeException;
	
	public Payment	restorePayment(long id) throws UTradeException;
	public long		storePayment(Payment p) throws UTradeException;
	
	public AttributeValueIteratorImpl restoreAttributeValues(Item item) throws UTradeException;
	public long storeAttributeValue(AttributeValue av) throws UTradeException;
	
	public boolean validateUser(String email, String pass) throws UTradeException;
	public boolean validateSession(String session) throws UTradeException;

	public void storeSession(long user_id,String session);
};
