package munction.modules.build.examples.chatprogram;

import munction.modules.build.ApplicationContext;
import munction.modules.build.examples.chatprogram.components.*;

public class InterfaceContainer
{
	public final String modulename = "USERINTERFACE";
	
	public ApplicationContext context;
	
	public InitializationStrategy initstrategy;
	
	//
	
	public JFrameX jframe000 = new JFrameX();
	
	public JPanelX jpanel000 = new JPanelX();
	
	public JPanelX jpanel001 = new JPanelX();
	
	public JMenuBarX jmenubar000 = new JMenuBarX();
	
	public JMenuX jmenu000 = new JMenuX();
	
	public JMenuX jmenu001 = new JMenuX();
	
	public JButtonX jbutton000 = new JButtonX();
	
	public JButtonX jbutton001 = new JButtonX();
	
	public JButtonX jbutton002 = new JButtonX();
	
	
	public InterfaceContainer()
	{
		this.context = new ApplicationContext();
		
		this.context.setlocalname("USERINTERFACE");
		
		this.context.setusername("USERNAME");
		
		this.context.setpassword("PASSWORD");
		
		this.context.setreference("{CLASSPATH}/contexts/userinterface/settings.xml", "{CLASSPATH}/{MODULENAME}");
		
		this.context.setnamespace("{MUNCTION}/{CLASSPATH}/");
		
		
		//
		
		this.initstrategy = new InitializationStrategy(context, this);
		
		initstrategy.container.jframe000.root(new JConfigX("{HIERARCHICAL}", "{{{MUNCTIONURL}}}"));
		
		initstrategy.container.jframe000.cord(new JConfigX("{HIERARCHICAL}", "{{{MUNCTIONURL}}}"), jmenubar000);
		
		initstrategy.container.jframe000.cord(new JConfigX("{HIERARCHICAL}", "{{{MUNCTIONURL}}}"), jpanel000);
		
		initstrategy.container.jframe000.cord(new JConfigX("{HIERARCHICAL}", "{{{MUNCTIONURL}}}"), jpanel001);
		
		initstrategy.container.jmenubar000.cord(new JConfigX("{HIERARCHICAL}", "{{{MUNCTIONURL}}}"), jmenu000);
		
		initstrategy.container.jmenubar000.cord(new JConfigX("{HIERARCHICAL}", "{{{MUNCTIONURL}}}"), jmenu001);
		
		initstrategy.container.jpanel000.cord(new JConfigX("{HIERARCHICAL}", "{{{MUNCTIONURL}}}"), jbutton000);
		
		initstrategy.container.jpanel000.cord(new JConfigX("{HIERARCHICAL}", "{{{MUNCTIONURL}}}"), jbutton001);
		
		initstrategy.container.jpanel000.cord(new JConfigX("{HIERARCHICAL}", "{{{MUNCTIONURL}}}"), jbutton002);
		
		//
		
		initstrategy.loose().model();
	}
}

class InitializationStrategy
{
	public LooseModelingThread loosemodelingthread = new LooseModelingThread(this);
	
	public TightModelingThread tightmodelingthread = new TightModelingThread(this);
	
	public InterfaceContainer container;
	
	public ApplicationContext context;
	
	//
	
	public InitializationStrategy(ApplicationContext context, InterfaceContainer container)
	{
		this.context = context;
		
		this.container = container;
	}
	
	//
	
	public InitializationStrategy loose()
	{
		this.loosemodelingthread.run();
		
		return this;
	}
	
	public InitializationStrategy tight()
	{
		this.tightmodelingthread.run();
		
		return this;
	}
	
	public InitializationStrategy model()
	{
		return this;
	}
	
	
	class LooseModelingThread extends Thread
	{
		public InitializationStrategy strategy;
		
		public LooseModelingThread(InitializationStrategy strategy)
		{
			this.strategy = strategy;
		}
		
		public void setstrategy(InitializationStrategy strategy)
		{
			this.strategy = strategy;
		}
		
		@Override
		public void run()
		{
			//loose modeling controller runs here
		}
	}
	
	class TightModelingThread extends Thread
	{
		public InitializationStrategy strategy;
		
		public TightModelingThread(InitializationStrategy strategy)
		{
			this.strategy = strategy;
		}
		
		public void setstrategy(InitializationStrategy strategy)
		{
			this.strategy = strategy;
		}
		
		@Override
		public void run()
		{
			//tight modeling controller runs here
		}
	}
	
}


