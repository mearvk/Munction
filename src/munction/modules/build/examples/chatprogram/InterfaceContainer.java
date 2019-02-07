package munction.modules.build.examples.chatprogram;

import munction.modules.build.examples.chatprogram.components.*;

public class InterfaceContainer
{
	public JFrameX jframe = new JFrameX();
	
	public JPanelX jpanelA = new JPanelX();
	
	public JPanelX jpanelB = new JPanelX();
	
	public JMenuBarX jmenubarA = new JMenuBarX();
	
	public JMenuX jmenuA = new JMenuX();
	
	public JMenuX jmenuB = new JMenuX();
	
	public JButtonX jbuttonA = new JButtonX();
	
	public JButtonX jbuttonB = new JButtonX();
	
	public JButtonX jbuttonC = new JButtonX();
	
	public InterfaceContainer()
	{
		InitializationStrategy initstrategy = new InitializationStrategy(this);
		
		initstrategy.container.jframe.root(new JConfigX("{DEFAULT}", "{MUNCTION}"));
		
		initstrategy.container.jframe.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jmenubarA);
		
		initstrategy.container.jframe.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jpanelA);
		
		initstrategy.container.jframe.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jpanelB);
		
		initstrategy.container.jmenubarA.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jmenuA);
		
		initstrategy.container.jmenubarA.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jmenuB);
		
		initstrategy.container.jpanelA.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jbuttonA);
		
		initstrategy.container.jpanelA.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jbuttonB);
		
		initstrategy.container.jpanelA.cord(new JConfigX("{DEFAULT}", "{MUNCTION}"), jbuttonC);
		
		//
		
		initstrategy.loose().model();
	}
}

class InitializationStrategy
{
	public Thread thread;
	
	public LooseModelingThread loosemodelingthread = new LooseModelingThread(this);
	
	public TightModelingThread tightmodelingthread = new TightModelingThread(this);
	
	public InterfaceContainer container;
	
	//
	
	public InitializationStrategy(InterfaceContainer container)
	{
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


