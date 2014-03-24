package model.entity.impl;

import java.util.*;
import model.entity.*;

public class AttributeImpl implements Attribute{
	
	//Entity attr
	private long a_id;
	private boolean a_written;
	
	//Attribute attr
	private String a_name;
	private Category a_of_category;
	
	//Empty constructor
	public AttributeImpl(){
		a_id=0;
		a_written=false;
		a_name = "Unknown";
		a_of_category = null;
	}
	
	//creating a new Attribute Object
	public AttributeImpl(Category c, String name){
		a_id=0;
		a_written=false;
		a_name = name;
		a_of_category = c;
	}
	
	//when retrieving from a data store
	public AttributeImpl(long dbid, Category c, String name){
		a_id=dbid;
		a_written=true;
		a_name = name;
		a_of_category=c;
	}
	
	// Entity methods
	
	public boolean  get_isProxy()
	{ return a_written; }
	
	public void  set_isProxy()
	{ a_written = true; }
	
	public long  get_id()
	{ return a_id; }
	
	public void  set_id( long id )
	{ a_id = id; }
	
	
	
	//readers
	public Category         getOf_category(){return a_of_category;}
	public String           getName(){return a_name;}
	//setters
	public void             setOf_category(Category c){a_of_category=c;}
	public void             setName(String name){a_name=name;}
}
