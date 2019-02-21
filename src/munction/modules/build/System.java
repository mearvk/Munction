package munction.modules.build;

import system.handlers.RegisteredHandler;

public class System
{
	public static System reference = new System();

	//

	public SystemExtender extender = new SystemExtender(reference);

	public MunctionExtender munction = new MunctionExtender(reference);

	//

	public static void staticref(String namespace, String name, Object o)
	{
		reference.extender.staticref(namespace, name, o);

		reference.munction.staticref(namespace,name,"xmnx://localhost");
	}

	public void ref(String namespace, String name, Object o)
	{
		reference.extender.ref(namespace, name, o);

		reference.munction.ref(namespace,name,"xmnx://localhost");
	}

	public void addObject(Object object, RegisteredHandler handler)
	{
	
	}
}

