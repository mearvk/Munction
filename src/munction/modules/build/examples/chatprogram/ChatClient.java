package munction.modules.build.examples.chatprogram;

import munction.modules.annotations.Munction;
import munction.modules.build.*;
import munction.modules.build.System;

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
        System.reference.ref("xmnx://container", "xmnx://chatclient", this);
    }
}

@Munction
class ChatClientExtent extends MunctionComponent
{
    public MunctionStoreExtent extent;

    public MunctionContainer container = new MunctionContainer();

    //

    @Munction
    public ChatClientExtent()
    {
        this.container.setprojectURL("xmnx://chatclient");

        this.container.setservername("xmnx://chatclient");

        this.container.setnamespace("xmnx://chatclient");

        //

        this.thread.setstartupmonitor(StartupMonitor.class);

        this.thread.setruntimemonitor(RuntimeMonitor.class);

        this.thread.setshutdownmonitor(ShutdownMonitor.class);

        this.thread.setframingmonitor(FramingMonitor.class);

        //

        MunctionStartQueue
            .befeel()
            .enqueue(ChatClientExtent.this.thread.startupmonitor);
    }

    @Munction
    class StartupMonitor extends Thread
    {
        @Override
        public void run()
        {
            ChatClientExtent.this.thread.startupmonitor.start();
        }
    }

    @Munction
    class RuntimeMonitor extends Thread
    {

        @Override
        public void run()
        {
            ChatClientExtent.this.thread.runtimemonitor.start();
        }
    }

    @Munction
    class ShutdownMonitor extends Thread
    {
        @Override
        public void run()
        {
            ChatClientExtent.this.thread.shutdownmonitor.start();
        }
    }

    @Munction
    class FramingMonitor extends Thread
    {
        @Override
        public void run()
        {
            ChatClientExtent.this.thread.framingmonitor.start();
        }
    }
}




