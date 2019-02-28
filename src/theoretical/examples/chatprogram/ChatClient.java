package theoretical.examples.chatprogram;

import munction.modules.annotations.Munction;
import theoretical.*;
import theoretical.System;

@Munction
public class ChatClient extends ChatClientExtent
{
    private MunctionDriver driver; //include for wrench functionality

    static
    {
        System.staticref("xmnx://org.mearvk.examples", "xmnx://chatclient", ChatClient.class);
    }

    public ChatClient()
    {
        System.reference.ref("xmnx://org.mearvk.examples", "xmnx://chatclient", this);
    }
}

