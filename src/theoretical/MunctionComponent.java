package theoretical;

import munction.modules.server.MunctionServer;

public class MunctionComponent
{
    public MunctionServer staticserver;

    public MunctionStoreExtent extent;

    public MunctionThread thread = new MunctionThread();

    //

    static
    {
        MunctionServer.staticreference.register("xmnx://org.mearvk","xmnx://munctioncomponent","xmnx://staticref/", MunctionComponent.class);
    }

    public MunctionComponent()
    {
        this.staticserver.register("","","");
    }
}
