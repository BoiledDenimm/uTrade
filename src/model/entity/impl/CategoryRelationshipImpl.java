//
//
//
//
//

package model.entity.impl;


import java.util.*;
import model.entity.*;


public class CategoryRelationshipImpl implements CategoryRelationship{
    
    //Entity Attributes
    private long c_id;
    private boolean c_written;
    
    //CategoryRelationships attributes
    private Category c_Parent;
    private Category c_Child;
    
    //Constructors
    public CategoryRelationshipImpl(){
        c_id = 0;
        c_written = false;
        c_Parent = null;
        c_Child = null;
    }
    
    public CategoryRelationshipImpl(Category parent, Category child){
        c_id = 0;
        c_written = false;
        c_Parent = parent;
        c_Child = child;
    }
    
    public CategoryRelationshipImpl(long id, Category parent, Category child){
        c_id = id;
        c_written = true;
        c_Parent = parent;
        c_Child = child;
    }

    // Entity methods
    //
    public boolean  get_isProxy()
    { return c_written; }
    
    public void  set_isProxy()
    { c_written = true; }
    
    public long  get_id()
    { return c_id; }
    
    public void  set_id( long id )
    { c_id = id; }
    
    //getters
    public Category		get_Parent(){return c_Parent;}
    public Category		get_Child(){return c_Child;}

    //setters
    public void		set_Parent( Category parent ){c_Parent = parent;}
    public void		set_Child( Category child ){c_Child = child;}
    
}
