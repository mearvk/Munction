package munction.modules.build.examples.chatprogram;

import munction.modules.build.examples.chatprogram.components.*;

public class InterfaceContainer
{
	public JFrameX jframe;
	
	public JPanelX jpanelA;
	
	public JPanelX jpanelB;
	
	public JMenuBarX jmenubarA;
	
	public JMenuX jmenuA;
	
	public JMenuX jmenuB;
	
	public JButtonX jbuttonA;
	
	public JButtonX jbuttonB;
	
	public JButtonX jbuttonC;
	
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
	
	public InterfaceContainer container;
	
	//
	
	public InitializationStrategy(InterfaceContainer container)
	{
		this.container = container;
	}
	
	//
	
	public InitializationStrategy loose()
	{
		return this;
	}
	
	public InitializationStrategy tight()
	{
		return this;
	}
	
	public InitializationStrategy model() { return this; }
}


