package munction.localized;

import system.handlers.RegisteredHandler;

public class System
{
	public static System reference = new System();

	public static SystemExtender extender = new SystemExtender(reference);

	//public static MunctionExtender munction = new MunctionExtender(reference);



	//

	static
	{
		System.extender.staticref("xmnx://"+System.class.getPackageName(),"xmnx://"+System.class.getSimpleName().toLowerCase(), System.class);
	}

	//

	public static void staticref(String namespace, String name, Object o)
	{
		System.extender.staticref(namespace, name, o);
	}

	public void ref(String namespace, String name, Object o)
	{
		System.extender.ref(namespace, name, o);
	}

	public void addObject(Object object, RegisteredHandler handler)
	{

	}
}

