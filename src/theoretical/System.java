package theoretical;

import system.handlers.RegisteredHandler;

import static java.lang.Boolean.FALSE;

public class System
{
	public static System reference = new System();

	public static SystemExtender extender = new SystemExtender(reference);

	public static MunctionExtender munction = new MunctionExtender(reference);



	//

	static
	{
		System.extender.staticref("xmnx://system","xmnx://system", System.class);
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

