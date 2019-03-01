package munction.development.persistence;

import munction.modules.atoms.AbstractFunctionalAtom;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.Presystem;
import system.System;
import system.handlers.RegisteredHandler;

public class PersistenceModule
{
	static
	{

	}

	public Presystem presystem;

	public System system;

	public PersistenceModule(Presystem presystem, System system)
	{
		this.presystem = presystem;

		this.system = system;
	}

	public void setRegistered()
	{
		java.lang.System.out.println("  >> Persistence module loaded");
	}

	public void unsetRegistered()
	{
		java.lang.System.out.println("  >> Persistence module loaded");
	}

	public void process()
	{
		BeanFactory factory = new ClassPathXmlApplicationContext("persistence.xml");

		//

		java.lang.System.out.println("Munction [Persistence Document]:");

		//

		munction.development.persistence.Presystem presystem = (munction.development.persistence.Presystem) factory.getBean("persistence.presystem");

		munction.development.persistence.System system = (munction.development.persistence.System) factory.getBean("persistence.system");

		//

		StandardPersistor standardpersistor = (StandardPersistor) factory.getBean("persistence.standard");

		CustomPersistor custompersistor = (CustomPersistor) factory.getBean("persistence.custom");

		//

		presystem.addObject(standardpersistor, new RegisteredHandler());

		presystem.addObject(custompersistor, new RegisteredHandler());

		//

		system.addObject(standardpersistor, new RegisteredHandler());

		system.addObject(custompersistor, new RegisteredHandler());

		//

		standardpersistor.setRegistered();

		custompersistor.setRegistered();

		//

		java.lang.System.out.println("  >> Munction functional enhancement callbacks set");
	}
}

class PersistenceModuleAtom extends AbstractFunctionalAtom
{
	public static final String version = "1.001";
}
