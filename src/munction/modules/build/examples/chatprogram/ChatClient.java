package munction.modules.build.examples.chatprogram;

import munction.modules.annotations.Munction;
import munction.modules.build.System;
import munction.modules.build.ChatClientExtent;

@Munction
public class ChatClient extends ChatClientExtent
{
    public static void main(String...args)
    {
        new ChatClient();
    }

    static
    {
        System.reference.staticref("xmnx://container", "xmnx://chatclient", ChatClient.class);
    }

    public ChatClient()
    {
        super();

        System.reference.ref("xmnx://container", "xmnx://chatclient", this);
    }
}