package munction.modules.build.examples.chatprogram;

import munction.modules.annotations.Munction;
import munction.modules.build.*;
import munction.modules.build.System;

@Munction()
public class ChatClient extends ChatClientExtent
{
    public static void main(String...args)
    {
        new ChatClient();
    }

    static
    {
        System.reference.staticref("mnx://munction", "mnx://chatclient", ChatClient.class);
    }

    public ChatClient()
    {
        System.reference.ref("mnx://munction", "mnx://chatclient", this);
    }
}

class ChatClientExtent extends MunctionComponent
{
    public MunctionContainer container = new MunctionContainer();

    //

    public ChatClientExtent()
    {
        this.thread.setstartupmonitor(StartupMonitor.class);

        this.thread.setruntimemonitor(RuntimeMonitor.class);

        this.thread.setshutdownmonitor(ShutdownMonitor.class);

        this.thread.setframingmonitor(FramingMonitor.class);

        //

        MunctionStartQueue
            .lazy()
            .enqueue(ChatClientExtent.this.thread.startupmonitor);
    }

    class StartupMonitor extends Thread
    {
        @Override
        public void run()
        {
            ChatClientExtent.this.thread.startupmonitor.start();
        }
    }

    class RuntimeMonitor extends Thread
    {

        @Override
        public void run()
        {
            ChatClientExtent.this.thread.runtimemonitor.start();
        }
    }

    class ShutdownMonitor extends Thread
    {
        @Override
        public void run()
        {
            ChatClientExtent.this.thread.shutdownmonitor.start();
        }
    }

    class FramingMonitor extends Thread
    {
        @Override
        public void run()
        {
            ChatClientExtent.this.thread.framingmonitor.start();
        }
    }
}




