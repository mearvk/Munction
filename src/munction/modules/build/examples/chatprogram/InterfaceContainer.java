package munction.modules.build.examples.chatprogram;

import munction.modules.build.examples.chatprogram.components.*;

public class InterfaceContainer
{
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
		InitializationStrategy initstrategy = new InitializationStrategy(this);
		
		initstrategy.container.jframe000.root(new JConfigX("/root", "{MUNCTION}"));
		
		initstrategy.container.jframe000.cord(new JConfigX("/root/jmenubar[000]", "{MUNCTION}"), jmenubar000);
		
		initstrategy.container.jframe000.cord(new JConfigX("/root/jpanel[000]", "{MUNCTION}"), jpanel000);
		
		initstrategy.container.jframe000.cord(new JConfigX("/root/jpanel[001]", "{MUNCTION}"), jpanel001);
		
		initstrategy.container.jmenubar000.cord(new JConfigX("/root/jmenubar[000]/jmenu[000]", "{MUNCTION}"), jmenu000);
		
		initstrategy.container.jmenubar000.cord(new JConfigX("/root/jmenubar[000]/jmenu[001]", "{MUNCTION}"), jmenu001);
		
		initstrategy.container.jpanel000.cord(new JConfigX("/root/jpanel[000]/jbutton[000]", "{MUNCTION}"), jbutton000);
		
		initstrategy.container.jpanel000.cord(new JConfigX("/root/jpanel[000]/jbutton[001]", "{MUNCTION}"), jbutton001);
		
		initstrategy.container.jpanel000.cord(new JConfigX("/root/jpanel[000]/jbutton[002]", "{MUNCTION}"), jbutton002);
		
		//
		
		initstrategy.loose().model();
	}
}

class InitializationStrategy
{
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


