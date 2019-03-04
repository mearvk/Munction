package munction.localized;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class SystemExtender
{
    public System system;

    public static boolean debug = TRUE;

    static
    {

    }

    public SystemExtender(System system)
    {
        this.system = system;
    }

    public void staticref(Class klass)
    {
        if(debug)
        {
            java.lang.System.out.println("[static] " +klass);
        }
    }

    public void staticref(String prefix, Class klass)
    {
        if(debug)
        {
            java.lang.System.out.println("[static] " + prefix+" : "+klass);
        }
    }

    public void staticref(String prefix, Object object)
    {
        if(debug)
        {
            java.lang.System.out.println("[static] " + prefix+" : "+object);
        }
    }

    public void staticref(String namespace, String name, Object o)
    {
        if(debug)
        {
            java.lang.System.out.println("[static] " + namespace + " : " + name + " : " + o);
        }
    }

    public void ref(Object object)
    {

    }

    public void ref(String namespace, String name, Object o)
    {
        if(debug)
        {
            java.lang.System.out.println("[instance] " + namespace + " : " + name + " : " + o);
        }
    }
}

