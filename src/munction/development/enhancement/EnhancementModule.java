package munction.development.enhancement;

import munction.modules.atoms.AbstractFunctionalAtom;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.Presystem;
import system.System;
import system.handlers.RegisteredHandler;

public class EnhancementModule extends EnhancementModuleAtom
{
	static
	{

	}

	public Presystem presystem;

	public System system;

	public EnhancementModule(Presystem presystem, System system)
	{
		this.presystem = presystem;

		this.system = system;
	}

	public void setRegistered()
	{
		java.lang.System.out.println("  >> Enhancement module loaded");
	}

	public void unsetRegistered()
	{
		java.lang.System.out.println("  >> Enhancement module loaded");
	}

	@Override
	public void process()
	{
		BeanFactory factory = new ClassPathXmlApplicationContext("enhancement.xml");

		//

		java.lang.System.out.println("Munction [Enhancement Document]:");

		//

		munction.development.enhancement.Presystem presystem = (munction.development.enhancement.Presystem) factory.getBean("enhancer.presystem");

		munction.development.enhancement.System system = (munction.development.enhancement.System) factory.getBean("enhancer.system");

		//

		StandardEnhancer standardenhancer = (StandardEnhancer) factory.getBean("enhancer.standard");

		CustomEnhancer customenhancer = (CustomEnhancer) factory.getBean("enhancer.custom");

		//

		presystem.addObject(standardenhancer, new RegisteredHandler());

		presystem.addObject(customenhancer, new RegisteredHandler());

		//

		system.addObject(standardenhancer, new RegisteredHandler());

		system.addObject(customenhancer, new RegisteredHandler());

		//

		standardenhancer.setRegistered();

		customenhancer.setRegistered();

		//

		java.lang.System.out.println("  >> Munction functional enhancement callbacks set");
	}
}

class EnhancementModuleAtom extends AbstractFunctionalAtom
{
	public static final String version = "1.001";
}
