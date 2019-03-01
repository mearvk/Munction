package munction.localized;

import munction.modules.server.MunctionServer;

public class MunctionComponent
{
    public MunctionServer server = new MunctionServer();

    public MunctionThread thread = new MunctionThread();

    public MunctionComponent parent;

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

        MunctionStartQueue
                .reference()
                .enqueue(parent.thread.startupmonitor)
                .enqueue(parent.thread.runtimemonitor)
                .enqueue(parent.thread.framingmonitor)
                .enqueue(parent.thread.shutdownmonitor)
                .start();
    }
}
