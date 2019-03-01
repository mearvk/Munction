package system.startup;

import munction.modules.ConnectorModule;
import munction.modules.MunctionModule;
import munction.localized.BuildModule;
import munction.development.enhancement.EnhancementModule;
import munction.development.persistence.PersistenceModule;
import munction.modules.web.WebModule;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import system.Presystem;
import system.System;
import system.handlers.RegisteredHandler;

public class Startup
{
	public Startup()
	{
		BeanFactory factory = new ClassPathXmlApplicationContext("startup.xml");

		java.lang.System.out.println("Munction [Modules]");

		//

		Presystem presystem = (Presystem) factory.getBean("presystem");

		System system = (System) factory.getBean("system");

		//

		MunctionModule munctionmodule = (MunctionModule) factory.getBean("munctionmodule");

		BuildModule buildmodule = (BuildModule) factory.getBean("buildmodule");

		EnhancementModule enhancementmodule = (EnhancementModule) factory.getBean("enhancementmodule");

		PersistenceModule persistencemodule = (PersistenceModule) factory.getBean("persistencemodule");

		ConnectorModule connectormodule = (ConnectorModule) factory.getBean("connectormodule");

		WebModule webmodule = (WebModule) factory.getBean("webmodule");

		//

		presystem.addObject(munctionmodule, new RegisteredHandler());

		presystem.addObject(buildmodule, new RegisteredHandler());

		presystem.addObject(enhancementmodule, new RegisteredHandler());

		presystem.addObject(persistencemodule, new RegisteredHandler());

		presystem.addObject(connectormodule, new RegisteredHandler());

		presystem.addObject(webmodule, new RegisteredHandler());

		//

		system.addObject(munctionmodule, new RegisteredHandler());

		system.addObject(buildmodule, new RegisteredHandler());

		system.addObject(enhancementmodule, new RegisteredHandler());

		system.addObject(persistencemodule, new RegisteredHandler());

		system.addObject(connectormodule, new RegisteredHandler());

		system.addObject(webmodule, new RegisteredHandler());

		//

		munctionmodule.setRegistered();

		buildmodule.setRegistered();

		enhancementmodule.setRegistered();

		persistencemodule.setRegistered();

		connectormodule.setRegistered();

		webmodule.setRegistered();

		//

		buildmodule.process();

		enhancementmodule.process();

		persistencemodule.process();

		connectormodule.process();

		webmodule.process();
	}

	public static void main(String... args)
	{
		new Startup();
	}
}
