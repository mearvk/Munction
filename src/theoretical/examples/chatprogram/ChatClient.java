package theoretical.examples.chatprogram;

import munction.modules.annotations.Munction;
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
    ChatClient client;

    public static void main(String...args)
    {

    }
}