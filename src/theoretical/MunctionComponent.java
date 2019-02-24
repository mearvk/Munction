package theoretical;

import munction.modules.server.MunctionServer;

public class MunctionComponent
{
    public MunctionServer server = new MunctionServer();

    public MunctionThread thread = new MunctionThread();

    //

    static
    {
        MunctionServer.staticreference.register("xmnx://org.mearvk.theoretical.examples","xmnx://munctioncomponent","xmnx://staticref/", MunctionComponent.class);
    }

    public MunctionComponent()
    {
        this.server.register("xmnx://org.mearvk.theoretical.examples","xmnx://munctioncomponent","xmnx://dynamicref/", this);;
    }
}
