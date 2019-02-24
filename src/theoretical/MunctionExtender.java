package theoretical;

import munction.modules.server.MunctionServer;

public class MunctionExtender extends MunctionComponent
{
    public System ref;

    static
    {
        System.staticref("xmnx://org.mearvk.examples", "xmnx://munctionextender", MunctionExtender.class);
    }

    public MunctionExtender(System ref)
    {
        this.ref = ref;
    }

    public void staticref(String namespace, String name, String munctionlink)
    {
        MunctionServer.staticextender.persist(namespace,name,munctionlink);
    }

    public void ref(String namespace, String name, String munctionlink)
    {
        MunctionServer.staticextender.persist(namespace,name,munctionlink);
    }
}
