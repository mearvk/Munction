package munction.modules.build;

public class SystemExtender
{
    public System system;

    public SystemExtender(System system)
    {
        this.system = system;
    }

    public void staticref(String namespace, String name, Object o)
    {
        java.lang.System.out.println("[static] "+namespace+" : "+name+" : "+o);
    }

    public void ref(String namespace, String name, Object o)
    {
        java.lang.System.out.println("[dynamic] "+namespace+" : "+name+" : "+o);
    }
}

