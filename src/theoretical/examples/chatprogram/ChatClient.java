package theoretical.examples.chatprogram;

import munction.modules.annotations.Munction;
import theoretical.MunctionException;
import theoretical.System;
import theoretical.ChatClientExtent;

@Munction
public class ChatClient extends ChatClientExtent
{
    static
    {
        System.staticref("xmnx://org.mearvk.examples", "xmnx://chatclient", ChatClient.class);
    }

    public ChatClient()
    {
        System.reference.ref("xmnx://org.mearvk.examples", "xmnx://chatclient", this);
    }
}

class Driver
{
    public static void main(String...args)
    {
        try
        {
            Class.forName("theoretical.examples.chatprogram.ChatClient").getConstructor().newInstance();
        }
        catch (Exception exception)
        {
            MunctionException.relist(exception, "","", true, true);
        }
    }
}

