package model.entity;

import java.util.*;

public interface Billing extends Entity{
	
	public String getAddressNumber();
	public String getStreetName();
	public String getZipcode();
	public String getApartmentNumber(); //may be null or "not filled in"
	public String getState();

	public void setAddressNumber(String address);
	public void setStreetName(String street);
	public void setZipcode(String zipcode);
	public void setApartmentNumber(String apartmentNumber);
	public void setState(String state);
	
};
