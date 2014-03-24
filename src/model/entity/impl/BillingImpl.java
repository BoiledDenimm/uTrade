package model.entity.impl;

import java.util.*;
import model.entity.*;

//Implementation of the Billing class
public class BillingImpl implements Billing{
    
    //Entity attributes
    private long    b_id;
    private boolean b_written;
    
    //Billing attributes
    private String  b_AddressNumber;
    private String  b_StreetName;
    private String  b_ZipCode;
    private String  b_ApartmentNumber;
    private String  b_State;
    
    //Constructors
    //Empty object
    public BillingImpl(){
        
        b_id = 0;
        b_written = false;
        b_AddressNumber = "Unknown";
        b_StreetName = "Unknown";
        b_ZipCode = "Unknown";
        b_ApartmentNumber = "Unknown";
        b_State = "Unknown";
    }
    
    //Creating Billing via a form
    public BillingImpl(String addressNumber, String streetName, String zipCode, String apartmentNumber, String state){
        b_id = 0;
        b_written = false;
        b_AddressNumber = addressNumber;
        b_StreetName = streetName;
        b_ZipCode = zipCode;
        b_ApartmentNumber = apartmentNumber;
        b_State = state;
    }
    
    //Object breated when restored from the database
    public BillingImpl(long id, String addressNumber, String streetName, String zipCode, String apartmentNumber, String state){
        
        b_id = id;
        b_written = true;
        b_AddressNumber = addressNumber;
        b_StreetName = streetName;
        b_ZipCode = zipCode;
        b_ApartmentNumber = apartmentNumber;
        b_State = state;
        
    }
    
    //Entity methods
    public boolean  get_isProxy()
    { return b_written; }
    
    public void  set_isProxy()
    { b_written = true; }
    
    public long  get_id()
    { return b_id; }
    
    public void  set_id( long id )
    { b_id = id; }
    
    //getters
        public String getAddressNumber() { return b_AddressNumber;}
	public String getStreetName(){return b_StreetName;}
	public String getZipcode(){return b_ZipCode;}
	public String getApartmentNumber(){return b_ApartmentNumber;}
	public String getState(){return b_State;}
    
    //setters
	public void setAddressNumber(String address){b_AddressNumber = address;}
	public void setStreetName(String street){b_StreetName = street;}
	public void setZipcode(String zipcode){b_ZipCode = zipcode;}
	public void setApartmentNumber(String apartmentNumber){b_ApartmentNumber = apartmentNumber;}
	public void setState(String state){b_State = state;}


}
