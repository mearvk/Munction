package system;

import system.handlers.RegisteredHandler;

import java.util.ArrayList;

public class System
{
	public static System staticsystem;
	
	static
	{
		System.staticsystem = new System();
	}
	
	public Presystem presystem;
	
	public System system;
	
	ArrayList<RegisteredHandler> handlers = new ArrayList();
	
	public System()
	{
		this.system = this;
	}
	
	public System(Presystem presystem)
	{
		this.presystem = presystem;
		
		this.system = this;
	}
	
	public void addObject(Object object, RegisteredHandler handler)
	{
		this.handlers.add(handler);
		
		handler.addObject(object);
		
		//java.lang.System.out.println("System accepts ["+object+"]");
	}
}
