package munction.localized;

import munction.modules.annotations.Munction;

@Munction
public class ChatClientExtent extends MunctionComponent
{
    public MunctionContainer container = new MunctionContainer("xmnx://chatclient","xmnx://chatclient","xmnx://chatclient","http://munction/projects/chatclient");

    //

    public MunctionAspectContainer application = new BodiEnabledAspectContainer("theoretical.examples.chatprogram.ChatClientApplicationAspect","xbdx://aspects/chatprogram/application");

    public MunctionAspectContainer network = new BodiEnabledAspectContainer("theoretical.examples.chatprogram.ChatClientNetworkAspect","xbdx://aspects/chatprogram/network");

    public MunctionAspectContainer userinterface = new BodiEnabledAspectContainer("theoretical.examples.chatprogram.ChatClientUserInterfaceAspect","xbdx://aspects/chatprogram/userinterface");

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

        this.container.cord(application, 1);

        this.container.cord(network, 2);

        this.container.cord(userinterface, 3);

        //

        this.thread.setstartupmonitor(ChatClientStartupMonitor.class);

        this.thread.setruntimemonitor(ChatClientRuntimeMonitor.class);

        this.thread.setshutdownmonitor(ChatClientShutdownMonitor.class);

        this.thread.setframingmonitor(ChatClientFramingMonitor.class);
    }
}
