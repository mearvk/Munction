package munction.modules.web;

import munction.modules.atoms.AbstractFunctionalAtom;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.Presystem;
import system.System;
import system.handlers.RegisteredHandler;

public class WebModule extends WebModuleAtom
{
	static
	{

	}

	public Presystem presystem;

	public System system;

	public WebModule(Presystem presystem, System system)
	{
		this.presystem = presystem;

		this.system = system;
	}

	public void setRegistered()
	{
		java.lang.System.out.println("  >> Web module loaded");
	}

	public void unsetRegistered()
	{
		java.lang.System.out.println("  >> Web module loaded");
	}

	@Override
	public void process()
	{
		BeanFactory factory = new ClassPathXmlApplicationContext("web.xml");

		//

		java.lang.System.out.println("Munction [Webengine Document]:");

		//

		munction.modules.web.Presystem presystem = (munction.modules.web.Presystem) factory.getBean("web.presystem");

		munction.modules.web.System system = (munction.modules.web.System) factory.getBean("web.system");

		//

		StandardWeb standardweb = (StandardWeb) factory.getBean("web.standard");

		CustomWeb customweb = (CustomWeb) factory.getBean("web.custom");

		//

		presystem.addObject(standardweb, new RegisteredHandler());

		presystem.addObject(customweb, new RegisteredHandler());

		//

		system.addObject(standardweb, new RegisteredHandler());

		system.addObject(customweb, new RegisteredHandler());

		//

		standardweb.setRegistered();

		customweb.setRegistered();

		//

		java.lang.System.out.println("  >> Munction functional enhancement callbacks set");
	}
}

class WebModuleAtom extends AbstractFunctionalAtom
{
	public static final String version = "1.001";
}
