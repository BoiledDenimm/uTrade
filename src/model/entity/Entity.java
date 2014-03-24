//
//
//Interface: Entity
//
//Ben Johnson
//


package model.entity;

public interface Entity{

	// is this a proxy object, i.e. based on an
	// object already stored in persistent store?
	public boolean get_isProxy();
	public void set_isProxy();

	// set and get this object's persistence (DB) id
	public long get_id();
	public void set_id(long id);
};
