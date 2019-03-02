package theoretical.examples.chatprogram;

import munction.localized.*;
import munction.localized.System;
import munction.modules.annotations.Munction;

@Munction
public class ChatClient extends ChatClientExtent
{
    private MunctionDriver driver;

    static
    {
        System.staticref("xmnx://"+ChatClient.class.getPackageName().toLowerCase(), "xmnx://"+ChatClient.class.getSimpleName().toLowerCase(), ChatClient.class);

        //

        try
        {
            MunctionBodi.put("xbdx://aspects/chatprogram/application", "", Class.forName("theoretical.examples.chatprogram.ChatClientApplicationAspect"));

            MunctionBodi.put("xbdx://aspects/chatprogram/network","", Class.forName("theoretical.examples.chatprogram.ChatClientNetworkAspect"));

            MunctionBodi.put("xbdx://aspects/chatprogram/userinterface","", Class.forName("theoretical.examples.chatprogram.ChatClientUserInterfaceAspect"));
        }
        catch(Exception exception)
        {
            MunctionException.relist(exception,"","", true, true);
        }
    }

    public ChatClient()
    {
        System.reference.ref("xmnx://org.mearvk.examples", "xmnx://chatclient", this);
    }

    //

    public static void main(String...args)
    {
        try
        {
            Class.forName("theoretical.examples.chatprogram.ChatClient").newInstance();
        }
        catch(Exception exception)
        {
            java.lang.System.out.println(exception);
        }
    }
}

