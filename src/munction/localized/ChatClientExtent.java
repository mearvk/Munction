package munction.localized;

import munction.modules.annotations.Munction;

@Munction
public class ChatClientExtent extends MunctionComponent
{
    public MunctionContainer container = new MunctionContainer("xmnx://chatclient","xmnx://chatclient","xmnx://chatclient","http://munction/projects/chatclient");

    //

    static
    {
        System.staticref("xmnx://org.mearvk.examples","xmnx://chatclientextent", ChatClientExtent.class);
    }

    @Munction
    public ChatClientExtent()
    {
        System.reference.ref("xmnx://org.mearvk.examples","xmnx://chatclientextent", this);

        //

        this.thread.setstartupmonitor(ChatClientStartupMonitor.class);

        this.thread.setruntimemonitor(ChatClientRuntimeMonitor.class);

        this.thread.setshutdownmonitor(ChatClientShutdownMonitor.class);

        this.thread.setframingmonitor(ChatClientFramingMonitor.class);
    }
}
