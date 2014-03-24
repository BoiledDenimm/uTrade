


package model.entity;


import java.util.*;

public interface Attribute extends Entity{

	//readers
	public Category		getOf_category();
	public String		getName(); 		
	//setters
	public void 		setOf_category(Category c);
	public void		setName(String name);
	
}
