package theoretical;

import munction.modules.server.MunctionServer;

public class MunctionComponent
{
    public MunctionServer server = new MunctionServer();

    public MunctionThread thread = new MunctionThread();

    //

    static
    {
        System.staticref("xmnx://org.mearvk.theoretical.examples","xmnx://munctioncomponent", MunctionComponent.class);

        //MunctionServer.staticreference.register("xmnx://org.mearvk.theoretical.examples","xmnx://munctioncomponent","xmnx://staticref/", MunctionComponent.class);
    }

    public MunctionComponent()
    {
        System.reference.ref("xmnx://org.mearvk.theoretical.examples","xmnx://munctioncomponent", MunctionComponent.class);

        //this.server.register("xmnx://org.mearvk.theoretical.examples","xmnx://munctioncomponent","xmnx://dynamicref/", this);;
    }
}
