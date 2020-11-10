package fr.mds.java.design_pattern.tp1.singleton;

import java.util.ArrayList;
import java.util.List;

import fr.mds.java.design_pattern.tp1.entities.Entity1;

public class Singleton
{
	
	private List<Entity1> result = new ArrayList<Entity1>();
	private int entityId = 0;
	
    private Singleton()
    {}
     
    private static Singleton INSTANCE = null;
     
    public static synchronized Singleton getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new Singleton(); 
        }
        return INSTANCE;
    }
    
    public void addInList() {
    	this.result.add(new Entity1(this.entityId, "data " + this.entityId));  
        this.newId();
    }
    
    public void newId() {
    	entityId ++;
    }
    
    public void getList() {
    	for (Entity1 item : result) {
    	      System.out.println(item);
    	}
    }
}
