package atomscripts;

import components.Builder;
import helpers.*;

import javax.swing.*;
import java.util.ArrayList;

public class ASNought
{
	public BuildScript script = null;
	
	public BuildScript[] scripts = null;
	
	public BuildScriptProcessor processor = null;
	
	public BuilderContainer container = new BuilderContainer();
	
	//
	
	public static class BuildScriptProcessor
	{
		public BuildScriptProcessor(BuildScript script)
		{
		
		}
		
		public BuildScriptProcessor(BuildScript[] scripts)
		{
		
		}
		
		public void process()
		{
		
		}
	}
	
	public static class BuildScript
	{
		public Item[] item;
		
		public Type[] type;
		
		public BuildScript(String URL)
		{
			//types
			
			//objects
			
			//setters
			
			//listeners
			
			//contexts
			
			//names
			
			//subnames
			
			//
		}
		
		public class Item
		{
			public Setters setters;
			
			public Listeners listeners;
		}
		
		public class Type
		{
			final String type = "null";
		}
	}
	
	public static class BuildContainer
	{
		ArrayList<ObjectContainer> container;
		
		public void reference(BuildContainer container, JComponent component, SwingObject object, CallbackHandler handler)
		{
		
		}
		
		public void serialize(BuildContainer container, JComponent component, SwingObject object, CallbackHandler handler)
		{
		
		}
		
		class ObjectContainer
		{
			ArrayList<SwingObject> objects;
		}
	}
	
	public static class BuilderContainer
	{
		public ArrayList<Builder.Coprocessor> coprocessors = new ArrayList();
		
		public BuilderContainer()
		{
		
		}
		
		public void run()
		{
		
		}
		
		public void addComponent(BuildContainer container, JComponent component, SwingObject object, CallbackHandler handler)
		{
			container.reference(container, component, object, handler); // store information for meta-documentation of product
			
			container.serialize(container, component, object, handler); // pre-process object for container.modules.MunctionModule, RMI, etc.
		}
		
		public void addDocument(Documenter documenter, BuildContainer container, JComponent component, SwingObject object, CallbackHandler handler, Options options)
		{
			documenter.reference(container, component, object, handler, options); // store information for meta-documentation of product
			
			documenter.serialize(container, component, object, handler, options); // process object for container.modules.MunctionModule, RMI, etc.
		}
	}
}

