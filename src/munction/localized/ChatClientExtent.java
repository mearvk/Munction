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

        this.thread.setstartupmonitor(StartupMonitor.class);

        this.thread.setruntimemonitor(RuntimeMonitor.class);

        this.thread.setshutdownmonitor(ShutdownMonitor.class);

        this.thread.setframingmonitor(FramingMonitor.class);

        //

        MunctionStartQueue
                .reference()
                .enqueue(ChatClientExtent.this.thread.startupmonitor)
                .enqueue(ChatClientExtent.this.thread.runtimemonitor)
                .enqueue(ChatClientExtent.this.thread.framingmonitor)
                .enqueue(ChatClientExtent.this.thread.shutdownmonitor)
                .start();
    }
}
