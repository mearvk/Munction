package munction.modules.build;

import system.handlers.RegisteredHandler;

public class System
{
	public static System reference = new System();

	public SystemExtender extension = new SystemExtender(reference);

	public MunctionExtender munction = new MunctionExtender(reference);

	//

	public static void staticref(String namespace, String name, Object o)
	{
		reference.extension.staticref(namespace, name, o);
	}

	public void ref(String namespace, String name, Object o)
	{
		reference.extension.ref(namespace, name, o);
	}


	public void addObject(Object object, RegisteredHandler handler)
	{
	
	}
}

