package munction.modules;

import munction.modules.atoms.AbstractFunctionalAtom;
import munction.development.connector.CustomConnector;
import munction.development.connector.StandardConnector;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.Presystem;
import system.System;
import system.handlers.RegisteredHandler;

public class ConnectorModule extends ConnectorModuleAtom
{
	static
	{
	
	}
	
	public Presystem presystem;
	
	public System system;
	
	public ConnectorModule(Presystem presystem, System system)
	{
		this.presystem = presystem;
		
		this.system = system;
	}
	
	public void setRegistered()
	{
		java.lang.System.out.println("  >> Connector module loaded");
	}
	
	public void unsetRegistered()
	{
		java.lang.System.out.println("  >> Connector module loaded");
	}
	
	@Override
	public void process()
	{
		BeanFactory factory = new ClassPathXmlApplicationContext("connector.xml");
		
		//
		
		java.lang.System.out.println("Munction [Connector Document]:");
		
		//
		
		munction.development.connector.Presystem presystem = (munction.development.connector.Presystem) factory.getBean("connector.presystem");
		
		munction.development.connector.System system = (munction.development.connector.System) factory.getBean("connector.system");
		
		//
		
		StandardConnector standardconnector = (StandardConnector) factory.getBean("connector.standard");
		
		CustomConnector customconnector = (CustomConnector) factory.getBean("connector.custom");
		
		//
		
		presystem.addObject(standardconnector, new RegisteredHandler());
		
		presystem.addObject(customconnector, new RegisteredHandler());
		
		//
		
		system.addObject(standardconnector, new RegisteredHandler());
		
		system.addObject(customconnector, new RegisteredHandler());
		
		//
		
		standardconnector.setRegistered();
		
		customconnector.setRegistered();
		
		//
		
		java.lang.System.out.println("  >> Munction functional enhancement callbacks set");
	}
}

class ConnectorModuleAtom extends AbstractFunctionalAtom
{
	public static final String version = "1.001";
}
