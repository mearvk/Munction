package munction.localized;

import munction.modules.atoms.AbstractFunctionalAtom;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.Presystem;
import system.System;
import system.handlers.RegisteredHandler;

public class BuildModule extends BuildModuleAtom
{
	static
	{
	
	}
	
	public Presystem presystem;
	
	public System system;
	
	public BuildModule(Presystem presystem, System system)
	{
		this.presystem = presystem;
		
		this.system = system;
	}
	
	public void setRegistered()
	{
		java.lang.System.out.println("  >> Build module loaded");
	}
	
	public void unsetRegistered()
	{
		java.lang.System.out.println("  >> Build module loaded");
	}
	
	@Override
	public void process()
	{
		BeanFactory factory = new ClassPathXmlApplicationContext("build.xml");
		
		//
		
		java.lang.System.out.println("Munction [Build Document]:");
		
		//
		
		munction.localized.Presystem presystem = (munction.localized.Presystem) factory.getBean("builder.presystem");
		
		munction.localized.System system = (munction.localized.System) factory.getBean("builder.system");
		
		//
		
		UserInterfaceInterpreter userinterpreter = (UserInterfaceInterpreter) factory.getBean("builder.interface");
		
		ApplicationInterpreter applicationinterpreter = (ApplicationInterpreter) factory.getBean("builder.container1");
		
		//
		
		presystem.addObject(userinterpreter, new RegisteredHandler());
		
		presystem.addObject(applicationinterpreter, new RegisteredHandler());
		
		//
		
		system.addObject(userinterpreter, new RegisteredHandler());
		
		system.addObject(applicationinterpreter, new RegisteredHandler());
		
		//
		
		userinterpreter.setRegistered();
		
		applicationinterpreter.setRegistered();
		
		//
		
		java.lang.System.out.println("  >> Munction functional theoretical callbacks set");
	}
}

class BuildModuleAtom extends AbstractFunctionalAtom
{
	public static final String version = "1.01";
}