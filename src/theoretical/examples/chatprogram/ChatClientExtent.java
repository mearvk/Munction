package theoretical.examples.chatprogram;

import munction.localized.BodiEnabledAspectContainer;
import munction.localized.MunctionAspectContainer;
import munction.localized.MunctionComponent;
import munction.localized.MunctionContainer;
import munction.localized.System;
import munction.modules.annotations.Munction;

@Munction
public class ChatClientExtent extends MunctionComponent
{
    public MunctionContainer container = new MunctionContainer("xmnx://chatclient","xmnx://chatclient","xmnx://chatclient","http://munction/projects/chatclient");

    //

    public MunctionAspectContainer application = new BodiEnabledAspectContainer(ChatClientApplicationAspect.class,"");

    public MunctionAspectContainer network = new BodiEnabledAspectContainer(ChatClientNetworkAspect.class,"");

    public MunctionAspectContainer userinterface = new BodiEnabledAspectContainer(ChatClientUserInterfaceAspect.class,"");

    //

    static
    {
        System.staticref(ChatClientExtent.class);
    }

    @Munction
    public ChatClientExtent()
    {
        System.reference.ref(this);

        //

        this.container.cord(application, 001);

        this.container.cord(network, 002);

        this.container.cord(userinterface, 003);

        //

        this.thread.setstartupmonitor(ChatClientStartupMonitor.class);

        this.thread.setruntimemonitor(ChatClientRuntimeMonitor.class);

        this.thread.setshutdownmonitor(ChatClientShutdownMonitor.class);

        this.thread.setframingmonitor(ChatClientFramingMonitor.class);
    }
}
