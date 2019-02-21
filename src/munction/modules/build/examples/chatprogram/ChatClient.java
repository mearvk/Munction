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
        System.reference.staticref("xmnx://munction", "xmnx://chatclient", ChatClient.class);
    }

    public ChatClient()
    {
        System.reference.ref("xmnx://munction", "xmnx://chatclient", this);
    }
}

@Munction
class ChatClientExtent extends MunctionComponent
{
    public MunctionContainer munction = new MunctionContainer();

    //

    @Munction
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




