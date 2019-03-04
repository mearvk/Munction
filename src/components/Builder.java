package components;

import atomscripts.AS001;
import atomscripts.ASNought;

public class Builder extends AS001
{
	//
	
	public PresystemCoprocessor presystem = null;
	
	public SystemCoprocessor system = null;
	
	public ApplicationCoprocessor application = null;
	
	public UICoprocessor userinterface = null;
	
	public NetworkCoprocessor network = null;
	
	//
	
	public Builder(ASNought.BuildScript script)
	{
		this.processor = new ASNought.BuildScriptProcessor(script);
		
		this.processor.process();
		
		this.script = script;
	}
	
	public Builder(ASNought.BuildScript[] scripts)
	{
		this.processor = new ASNought.BuildScriptProcessor(scripts);
		
		this.processor.process();
		
		this.scripts = scripts;
	}
	
	public void run()
	{
		for (int i = 0; i < container.coprocessors.size(); i++)
		{
			container.coprocessors.get(i).run();
		}
	}
	
	public void reference()
	{
	}
	
	public void build()
	{
	}
	
	public void send()
	{
	}
	
	public class Coprocessor implements Runnable
	{
		public void run()
		{
		}
	}
	
	public class PresystemCoprocessor extends Coprocessor
	{
		public PresystemCoprocessor()
		{
			java.lang.System.out.println("  Initializing [Presystem Build Coprocessor]");
			
		}
		
		public void process()
		{
			//presystem
			
			Builder coprocessor = new Builder(new ASNought.BuildScript(""));
			
			coprocessor.reference();  //setreference scripts, timings, callbacks, identifiers
			
			coprocessor.build();      //theoretical
			
			coprocessor.send();       //upload
		}
	}
	
	public class SystemCoprocessor extends Coprocessor
	{
		public SystemCoprocessor()
		{
			java.lang.System.out.println("  Initializing [System Build Coprocessor]");
		}
		
		public void process()
		{
			//system
			
			Builder coprocessor = new Builder(new ASNought.BuildScript(""));
			
			coprocessor.reference();  //setreference scripts, timings, callbacks, identifiers
			
			coprocessor.build();      //theoretical
			
			coprocessor.send();       //upload
		}
	}
	
	public class ApplicationCoprocessor extends Coprocessor
	{
		public ApplicationCoprocessor()
		{
			java.lang.System.out.println("  Initializing [Application Build Coprocessor]");
		}
		
		public void process()
		{
			//container1
			
			Builder coprocessor = new Builder(new ASNought.BuildScript(""));
			
			coprocessor.reference();  //setreference scripts, timings, callbacks, identifiers
			
			coprocessor.build();      //theoretical
			
			coprocessor.send();       //upload
		}
	}
	
	public class UICoprocessor extends Coprocessor
	{
		public UICoprocessor()
		{
			java.lang.System.out.println("  Initializing [UI Build Coprocessor]");
		}
		
		public void process()
		{
			//user interface
			
			Builder coprocessor = new Builder(new ASNought.BuildScript(""));
			
			coprocessor.reference();  //setreference scripts, timings, callbacks, identifiers
			
			coprocessor.build();      //theoretical
			
			coprocessor.send();       //upload
		}
	}
	
	public class NetworkCoprocessor extends Coprocessor
	{
		public NetworkCoprocessor()
		{
			java.lang.System.out.println("  Initializing [Network Build Coprocessor]");
		}
		
		public void process()
		{
			//container2
			
			Builder coprocessor = new Builder(new ASNought.BuildScript(""));
			
			coprocessor.reference();  //setreference scripts, timings, callbacks, identifiers
			
			coprocessor.build();      //theoretical
			
			coprocessor.send();       //upload
		}
	}
}
