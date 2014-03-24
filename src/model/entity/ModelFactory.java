package model.entity;

import model.entity.impl.*;
import java.util.*;



public class ModelFactory {
	//Attribute constructors
	public static Attribute createAttribute(){
		return new AttributeImpl();
	}
	
	public static Attribute createAttribute(Category c, String name){
		return new AttributeImpl(c, name);
	}
	
	public static Attribute createAttribute(long dbid, Category c, String name){
		return new AttributeImpl(dbid, c, name);
	}
	
	//Attribute Value constructors
	public static AttributeValue createAttributeValue(){
		return new AttributeValueImpl();
	}
	
	public static AttributeValue createAttributeValue(String value, Item of_Item, Attribute of_Attribute){
		return new AttributeValueImpl(value, of_Item, of_Attribute);
	}

	
	public static AttributeValue createAttributeValue(long id, String value, Item of_Item, Attribute of_Attribute){
		return new AttributeValueImpl(id, value, of_Item, of_Attribute);
	}


	//Bid constructors
	public static Bid createBid(){
	
		return new BidImpl();
	}

	public static Bid createBid(User of_User, Item of_Item,
			double value){

		return new BidImpl(of_User, of_Item, value);
	}

	public static Bid createBid(long id, User of_User, Item of_Item,
			double value){

		return new BidImpl(id, of_User, of_Item, value);
	}



	//Billing constructors
	public static Billing createBilling(){
		
		return new BillingImpl();
	}

	public static Billing createBilling(String addressNumber, String streetName, 
			String zipCode, String apartmentNumber, String state){
		
		return new BillingImpl(addressNumber, streetName, zipCode, 
			apartmentNumber, state);
	}

	public static Billing createBilling(long id, String addressNumber, 
		String streetName, String zipCode, String apartmentNumber, String state){
		
		return new BillingImpl( id, addressNumber, streetName, 
		        zipCode, apartmentNumber, state);
	}

	//Category constructors
	public static Category createCategory(){
		
		return new CategoryImpl();
	}

	public static Category createCategory(double percentCharged, String name){
		
		return new CategoryImpl(percentCharged, name);
	}

	public static Category createCategory(long id,  double percentCharged, String name){

		return new CategoryImpl(id, percentCharged, name);
	}

	//CategoryRelationships constructors
	public static CategoryRelationship createCategoryRelationship(){
		return new CategoryRelationshipImpl();
	} 	

	public static CategoryRelationship createCategoryRelationship(Category parent, Category child){
		return new CategoryRelationshipImpl(parent, child);
	}
 	
	public static CategoryRelationship createCategoryRelationship(long id, Category parent, Category child){
		return new CategoryRelationshipImpl(id, parent, child);
	}

	//Item constructors
	public static Item createItem(){
		
		return new ItemImpl();
	}

	public static Item createItem(double finalPrice, double minBid, User seller,
			Bid topBid, Date auctionEnd, String name, int quantity,
			Category category, User winner){

		return new ItemImpl(finalPrice, minBid, seller, topBid, auctionEnd,  name, quantity,category, winner);
	}

	public static Item createItem(long id, double finalPrice, double minBid, 
			User seller, Bid topBid, Date auctionEnd, String name, 
			int quantity, Category category, boolean isActive, User winner){

		return  new ItemImpl(id, finalPrice,  minBid, seller, topBid, auctionEnd, name, quantity, category,  isActive, winner);

	}

	//Payment constructors
	public static Payment createPayment(){

		return new PaymentImpl();
	}

	public static Payment createPayment(String cardType, String secCode, 
			String expDate, String cardNum){

		return new PaymentImpl(cardType, secCode, expDate, cardNum);
	}

	public static Payment createPayment(long id, String cardType, String secCode, 
			String expDate, String cardNum){

		return new PaymentImpl(id, cardType, secCode, expDate, cardNum);
	}

	//User constructors 
	public static UserImpl createUser(){

		return new UserImpl();
	}

	public static User createUser(String fn, String ln, String email, String pass, boolean isAdmin){
	
		return new UserImpl(fn, ln, email, pass, isAdmin);
	}

	public static User createUser(long id, String fn, String ln, String email, String  pass, boolean isAdmin){
	
		return new UserImpl(id,  fn, ln, email, pass, isAdmin);
	}


}
