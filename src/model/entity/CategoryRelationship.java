//
//
//
//


package model.entity;

import java.util.*;


public interface CategoryRelationship extends Entity{
        
        // operations
        
        // Getters
        public Category		get_Parent();
        public Category		get_Child();
        
        // Setters
        public void		set_Parent( Category parent );
        public void		set_Child( Category child );
        
    };
