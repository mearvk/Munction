package theoretical.examples.chatprogram;

import munction.localized.BodiEnabledAspectContainer;
import munction.localized.MunctionAspectContainer;
import munction.localized.MunctionComponent;
import munction.localized.MunctionContainer;
import munction.localized.System;
import munction.modules.annotations.Munction;

@Munction(policy = "xbdx://policies/MunctionComponent")
public class ChatClientExtent extends MunctionComponent
{
    public MunctionContainer container = new MunctionContainer("xmnx://chatclient","xmnx://chatclient","xmnx://chatclient","http://munction/projects/chatclient");

    //

    @Munction(order = 1, policy = "xbdx://policies/MunctionComponent/DevelopmentApplicationAspect")
    public MunctionAspectContainer application = new BodiEnabledAspectContainer(DevelopmentApplicationAspect.class,"");

    @Munction(order = 2, policy = "xbdx://policies/MunctionComponent/DevelopmentNetworkAspect")
    public MunctionAspectContainer network = new BodiEnabledAspectContainer(DevelopmentNetworkAspect.class,"");

    @Munction(order = 3, policy = "xbdx://policies/MunctionComponent/DevelopmentUserInterfaceAspect")
    public MunctionAspectContainer userinterface = new BodiEnabledAspectContainer(DevelopmentUserInterfaceAspect.class,"");

    //

    static
    {
        System.staticref(ChatClientExtent.class);
    }

    @Munction
    public ChatClientExtent()
    {
        System.reference.ref(this);
    }
}
