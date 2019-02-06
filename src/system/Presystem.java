package system;

import system.handlers.RegisteredHandler;

import java.util.ArrayList;

public class Presystem
{
	public static Presystem staticpresystem;
	
	public static System staticsystem;
	
	static
	{
		staticpresystem = new Presystem();
	}
	
	public ArrayList<RegisteredHandler> handlers = new ArrayList();
	
	public Presystem presystem;
	
	public System system;
	
	public Presystem()
	{
		this.presystem = this;
	}
	
	public void addObject(Object object, RegisteredHandler handler)
	{
		this.handlers.add(handler);
		
		handler.addObject(object);
		
		//java.lang.System.out.println("Presystem accepts ["+object+"]");
	}
}
