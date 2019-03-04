package munction.localized;

import system.handlers.RegisteredHandler;

public class System
{
	public static System reference = new System();

	public static SystemExtender extender = new SystemExtender(reference);



	static
	{
		System.extender.staticref("xmnx://"+System.class.getPackageName(),"xmnx://"+System.class.getSimpleName().toLowerCase(), System.class);
	}

	public static void staticref(Class klass)
	{
		System.extender.staticref(klass);
	}

	public static void staticref(String prefix, Class klass)
	{
		System.extender.staticref(prefix, klass);
	}

	public static void staticref(String prefix, Object object)
	{
		System.extender.staticref(prefix, object);
	}

	public static void staticref(String namespace, String name, Object o)
	{
		System.extender.staticref(namespace, name, o);
	}

	public void ref(Object object)
	{
		System.extender.ref(object);
	}

	public void ref(String namespace, String name, Object object)
	{
		System.extender.ref(namespace, name, object);
	}

	public void addObject(Object object, RegisteredHandler handler)
	{

	}
}

