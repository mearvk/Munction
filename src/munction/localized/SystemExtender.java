package munction.localized;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class SystemExtender
{
    public System system;

    public static boolean debug = TRUE;

    static
    {
        //System.staticref("xmnx://system","xmnx://system", SystemExtender.class);
    }

    public SystemExtender(System system)
    {
        this.system = system;
    }

    public void staticref(String namespace, String name, Object o)
    {
        if(debug)
        {
            java.lang.System.out.println("[static] " + namespace + " : " + name + " : " + o);
        }
    }

    public void ref(String namespace, String name, Object o)
    {
        if(debug)
        {
            java.lang.System.out.println("[instance] " + namespace + " : " + name + " : " + o);
        }
    }
}

