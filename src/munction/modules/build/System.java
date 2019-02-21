package munction.modules.build;

import system.handlers.RegisteredHandler;

public class System
{
	public static System extender = new System();

	public SystemExtender extension = new SystemExtender(extender);

	//

	public static void staticref(String namespace, String name, Object o)
	{
		extender.extension.staticref(namespace, name, o);
	}

	public void ref(String namespace, String name, Object o)
	{
		extender.extension.ref(namespace, name, o);
	}

	public void addObject(Object object, RegisteredHandler handler)
	{
	
	}
}

